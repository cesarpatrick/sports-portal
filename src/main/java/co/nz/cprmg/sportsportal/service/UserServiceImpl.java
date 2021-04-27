package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.*;
import co.nz.cprmg.sportsportal.repository.FavouriteRepository;
import co.nz.cprmg.sportsportal.repository.UserRepository;
import co.nz.cprmg.sportsportal.util.HashUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;
    LeagueService leagueService;
    FavouriteRepository favouriteRepository;

    public UserServiceImpl(UserRepository userRepository, LeagueService leagueService,FavouriteRepository favouriteRepository) {
        this.leagueService = leagueService;
        this.userRepository = userRepository;
        this.favouriteRepository = favouriteRepository;
    }

    @Override
    public User getUserById(Integer idUser){
        User user = userRepository.findById(idUser)
                .orElse(new User());
        return user;
    }

    @Override
    public User getUserByLoginByPassword(String login, String password){
        User user = userRepository.getUserByUsernameAndPassword(login,password);
        user.setPassword(HashUtils.getHashMd5(user.getPassword()));
        return user;
    }

    public User save(User user){
        return userRepository.save(user);
    }

    @Override
    public Boolean existsByEmail(String email){
        return userRepository.existsByEmail(email);
    }

    @Override
    public Boolean existsByUsername(String username){
        return userRepository.existsByUsername(username);
    }

    @Override
    public User addFavouriteLeague(Integer idLeague, String username){
        Optional<User> userLoaded= userRepository.findByUsername(username);

        User user = userLoaded.get();

        List<Favourite> listFavourites = new ArrayList<>();

        Favourite favourite = new Favourite();
        favourite.setUser(user);
        favourite.setId_league(idLeague);

        if(!isRepeted(idLeague,user.getFavourites()))
        {
            listFavourites.add(favourite);
        }

        user.setFavourites(listFavourites);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll(){
        List<User> users = new ArrayList<>();

        Iterable<User> list =  userRepository.findAll();

        for (User user: list) {
            users.add(user);
        }

        return users;
    }

    @Override
    public LeagueList favourites(Integer idUser){
        LeagueList listReturn = new LeagueList();

        Optional<User> userLoaded= userRepository.findById(idUser);

        User user = userLoaded.get();

        LeagueList leagues = leagueService.getAllLeagues();

        for (League league : leagues.getLeagues()) {
            for(Favourite favourite : user.getFavourites()){
                if(league.getIdLeague().equals(favourite.getId_league())){
                    listReturn.getLeagues().add(league);
                }

            }
        }

        return listReturn;
    }

    public boolean isRepeted(Integer idLeague, List<Favourite> favourites){

        for (Favourite favourite: favourites) {
            if(favourite.getId_league().equals(idLeague)){
                return true;
            }
        }

        return false;
    }

    @Override
    public void removeFavourites(Integer idLeague, String username){
        Optional<User> userLoaded= userRepository.findByUsername(username);
        User user = userLoaded.get();

        Favourite favourite = favouriteRepository.getFavourite(idLeague,user.getId());
        favouriteRepository.delete(favourite);
    }
}

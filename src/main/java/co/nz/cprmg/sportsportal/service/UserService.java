package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.LeagueList;
import co.nz.cprmg.sportsportal.model.Leagues;
import co.nz.cprmg.sportsportal.model.User;

import java.util.List;

public interface UserService {

    User getUserById(Integer idUser);
    User getUserByLoginByPassword(String login, String password);
    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
    User addFavouriteLeague(Integer idLeague, String username);
    List<User> getAll();
    LeagueList favourites(Integer idUser);
    void removeFavourites(Integer idLeague, String username);

}

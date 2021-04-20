package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.User;
import co.nz.cprmg.sportsportal.repository.UserRepository;
import co.nz.cprmg.sportsportal.util.HashUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
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
}

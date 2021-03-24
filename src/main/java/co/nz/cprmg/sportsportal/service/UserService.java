package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.User;
import co.nz.cprmg.sportsportal.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Integer idUser){
        User user = userRepository.findById(idUser)
                .orElse(new User());
        return user;
    }

    public User getUserByLoginByPassword(String login, String password){
        return userRepository.getUserByLoginAndPassword(login,password);
    }
}

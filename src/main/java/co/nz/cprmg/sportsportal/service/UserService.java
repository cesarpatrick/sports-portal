package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.User;

public interface UserService {

    User getUserById(Integer idUser);
    User getUserByLoginByPassword(String login, String password);
    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
}

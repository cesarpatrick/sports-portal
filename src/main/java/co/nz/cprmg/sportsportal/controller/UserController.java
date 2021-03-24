package co.nz.cprmg.sportsportal.controller;

import co.nz.cprmg.sportsportal.model.User;
import co.nz.cprmg.sportsportal.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getTeamsByLeague(@PathVariable User user) {
        return null;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestBody User user) {
        return userService.getUserByLoginByPassword(user.getLogin(), user.getPassword());
    }

}

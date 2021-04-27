package co.nz.cprmg.sportsportal.controller;

import co.nz.cprmg.sportsportal.model.LeagueList;
import co.nz.cprmg.sportsportal.model.User;
import co.nz.cprmg.sportsportal.service.UserDetailsImpl;
import co.nz.cprmg.sportsportal.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User save(@RequestBody User user) {
        return null;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST,
                    produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestBody User user) {

        User userReturn = new User();

        if(user != null){
            userReturn = userService.getUserByLoginByPassword(user.getUsername(), user.getPassword());
        }

        return userReturn;
    }

    @RequestMapping(value = "/{idLeague}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User addFavouriteLeague(@PathVariable Integer idLeague) {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userService.addFavouriteLeague(idLeague,userDetails.getUsername());
    }

    @RequestMapping(value = "/search/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User searchUserById(@PathVariable Integer id) {
      return userService.getUserById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping(value = "/favourites", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList favourites() {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userService.favourites(userDetails.getId());
    }

    @RequestMapping(value = "/favourites/remove/{idLeague}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean removeFavouriteById(@PathVariable Integer idLeague) {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userService.removeFavourites(idLeague,userDetails.getUsername());
        return true;
    }

}

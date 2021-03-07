package co.nz.cprmg.sportsportal.controller;

import co.nz.cprmg.sportsportal.model.SportList;
import co.nz.cprmg.sportsportal.service.SportService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/sport")
public class SportController {
    SportService sportService;

    public SportController(SportService sportService) {
        this.sportService = sportService;
    }

    @RequestMapping(value = "/allSports", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<SportList> getToken( ){
        return ResponseEntity.ok(sportService.getAllSports().getBody());
    }
}

package co.nz.cprmg.sportsportal.controller;

import co.nz.cprmg.sportsportal.model.LeagueList;
import co.nz.cprmg.sportsportal.model.Leagues;
import co.nz.cprmg.sportsportal.service.SoccerService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/soccer")
public class SoccerController {
    SoccerService soccerService;

    public SoccerController(SoccerService soccerService) {
        this.soccerService = soccerService;
    }

    @RequestMapping(value = "/allLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllLeagues() {
        return soccerService.getAllLeagues();
    }
    @RequestMapping(value = "/league/teams/{idLeague}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getTeamsByLeague(@PathVariable Integer idLeague) {
        return soccerService.getAllLeagues();
    }

    @RequestMapping(value = "/league/detail/{idLeague}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Leagues getToken(@PathVariable Integer idLeague) {
        return soccerService.getLeagueDetail(idLeague);
    }

}

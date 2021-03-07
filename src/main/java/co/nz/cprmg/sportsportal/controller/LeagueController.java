package co.nz.cprmg.sportsportal.controller;

import co.nz.cprmg.sportsportal.model.LeagueList;
import co.nz.cprmg.sportsportal.model.Leagues;
import co.nz.cprmg.sportsportal.service.LeagueService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/league")
public class LeagueController {
    LeagueService leagueService;

    public LeagueController(LeagueService soccerService) {
        this.leagueService = soccerService;
    }

    @RequestMapping(value = "/{sportName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getTeamsByLeague(@PathVariable String sportName) {
        return leagueService.getAllLeaguesBySport(sportName);
    }

    @RequestMapping(value = "/league/detail/{idLeague}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Leagues getToken(@PathVariable Integer idLeague) {
        return leagueService.getLeagueDetail(idLeague);
    }

}

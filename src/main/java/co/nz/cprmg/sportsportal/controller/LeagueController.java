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

    @RequestMapping(value = "/allSoccerLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllLeagues() {
        return leagueService.getAllSoccerLeagues();
    }

    @RequestMapping(value = "/allMotorSportsLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllMotorSportsLeagues() {
        return leagueService.getAllMotorSportLeagues();
    }

    @RequestMapping(value = "/allFightingLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllFightingLeagues() {
        return leagueService.getAllFightingLeagues();
    }

    @RequestMapping(value = "/allBaseballLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllBaseballLeagues() {
        return leagueService.getAllBaseballLeagues();
    }

    @RequestMapping(value = "/allAmericanFootballLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllAmericanFootballLeagues() {
        return leagueService.getAllAmericanFootballLeagues();
    }

    @RequestMapping(value = "/allIceHockeyLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllIceHockeyLeagues() {
        return leagueService.getAllIceHockeyLeagues();
    }

    @RequestMapping(value = "/allGolfLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllGolfLeagues() {
        return leagueService.getAllGolfLeagues();
    }

    @RequestMapping(value = "/allBasketballLeagues", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getAllBasketballLeagues() {
        return leagueService.getAllBasketballLeagues();
    }

    @RequestMapping(value = "/league/teams/{idLeague}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LeagueList getTeamsByLeague(@PathVariable Integer idLeague) {
        return leagueService.getAllSoccerLeagues();
    }

    @RequestMapping(value = "/league/detail/{idLeague}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Leagues getToken(@PathVariable Integer idLeague) {
        return leagueService.getLeagueDetail(idLeague);
    }

}

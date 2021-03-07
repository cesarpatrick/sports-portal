package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.config.SystemConstants;
import co.nz.cprmg.sportsportal.model.League;
import co.nz.cprmg.sportsportal.model.LeagueList;
import co.nz.cprmg.sportsportal.model.Leagues;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeagueService {

    RestTemplate restTemplate = new RestTemplate();

    public LeagueList getAllSoccerLeagues(){
        ResponseEntity<LeagueList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_LEAGUES_URL.getValue(),
                        LeagueList.class);

        List<League> leagueList = new ArrayList<>();

        if(response.getBody() != null) {
            for (League league : response.getBody().getLeagues()) {
                if (league.getStrSport().equalsIgnoreCase(SystemConstants.SOCCER.getValue())) {
                    leagueList.add(league);
                }
            }
        }

        return new LeagueList(leagueList);
    }

    public Leagues getLeagueDetail(Integer idLeague){
        ResponseEntity<Leagues> response =
                restTemplate.getForEntity(
                        SystemConstants.GET_LEAGUE_DETAILS_URL.getValue() + idLeague,
                        Leagues.class);
        return response.getBody();
    }

    public LeagueList getAllMotorSportLeagues(){
        ResponseEntity<LeagueList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_LEAGUES_URL.getValue(),
                        LeagueList.class);

        List<League> leagueList = new ArrayList<>();

        if(response.getBody() != null) {
            for (League league : response.getBody().getLeagues()) {
                if (league.getStrSport().equalsIgnoreCase(SystemConstants.MOTORSPORTS.getValue().toUpperCase())) {
                    leagueList.add(league);
                }
            }
        }

        return new LeagueList(leagueList);
    }

    public LeagueList getAllFightingLeagues(){
        ResponseEntity<LeagueList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_LEAGUES_URL.getValue(),
                        LeagueList.class);

        List<League> leagueList = new ArrayList<>();

        if(response.getBody() != null) {
            for (League league : response.getBody().getLeagues()) {
                if (league.getStrSport().equalsIgnoreCase(SystemConstants.FIGHTING.getValue().toUpperCase())) {
                    leagueList.add(league);
                }
            }
        }

        return new LeagueList(leagueList);
    }

    public LeagueList getAllBaseballLeagues(){
        ResponseEntity<LeagueList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_LEAGUES_URL.getValue(),
                        LeagueList.class);

        List<League> leagueList = new ArrayList<>();

        if(response.getBody() != null) {
            for (League league : response.getBody().getLeagues()) {
                if (league.getStrSport().equalsIgnoreCase(SystemConstants.BASEBALL.getValue().toUpperCase())) {
                    leagueList.add(league);
                }
            }
        }

        return new LeagueList(leagueList);
    }

    public LeagueList getAllAmericanFootballLeagues(){
        ResponseEntity<LeagueList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_LEAGUES_URL.getValue(),
                        LeagueList.class);

        List<League> leagueList = new ArrayList<>();

        if(response.getBody() != null) {
            for (League league : response.getBody().getLeagues()) {
                if (league.getStrSport().equalsIgnoreCase(SystemConstants.AMERICAN_FOOTBALL.getValue().toUpperCase())) {
                    leagueList.add(league);
                }
            }
        }

        return new LeagueList(leagueList);
    }

    public LeagueList getAllIceHockeyLeagues(){
        ResponseEntity<LeagueList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_LEAGUES_URL.getValue(),
                        LeagueList.class);

        List<League> leagueList = new ArrayList<>();

        if(response.getBody() != null) {
            for (League league : response.getBody().getLeagues()) {
                if (league.getStrSport().equalsIgnoreCase(SystemConstants.ICE_HOCKEY.getValue().toUpperCase())) {
                    leagueList.add(league);
                }
            }
        }

        return new LeagueList(leagueList);
    }

    public LeagueList getAllGolfLeagues(){
        ResponseEntity<LeagueList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_LEAGUES_URL.getValue(),
                        LeagueList.class);

        List<League> leagueList = new ArrayList<>();

        if(response.getBody() != null) {
            for (League league : response.getBody().getLeagues()) {
                if (league.getStrSport().equalsIgnoreCase(SystemConstants.GOLF.getValue().toUpperCase())) {
                    leagueList.add(league);
                }
            }
        }

        return new LeagueList(leagueList);
    }

    public LeagueList getAllBasketballLeagues(){
        ResponseEntity<LeagueList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_LEAGUES_URL.getValue(),
                        LeagueList.class);

        List<League> leagueList = new ArrayList<>();

        if(response.getBody() != null) {
            for (League league : response.getBody().getLeagues()) {
                if (league.getStrSport().equalsIgnoreCase(SystemConstants.BASKETBALL.getValue().toUpperCase())) {
                    leagueList.add(league);
                }
            }
        }

        return new LeagueList(leagueList);
    }

}

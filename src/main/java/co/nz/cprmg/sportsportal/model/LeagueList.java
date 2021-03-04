package co.nz.cprmg.sportsportal.model;

import java.util.ArrayList;
import java.util.List;

public class LeagueList {

    private List<League> leagues;

    public LeagueList(){
        leagues = new ArrayList<League>();
    }

    public LeagueList(List<League> leagues) {
        this.leagues = leagues;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<League> leagues) {
        this.leagues = leagues;
    }
}

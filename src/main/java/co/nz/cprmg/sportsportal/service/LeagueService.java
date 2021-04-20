package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.LeagueList;
import co.nz.cprmg.sportsportal.model.Leagues;

public interface LeagueService {

    LeagueList getAllLeaguesBySport(String sportName);

    Leagues getLeagueDetail(Integer idLeague);
}

package co.nz.cprmg.sportsportal.config;

public enum SystemConstants {

    //API SPORT URLS
    ALL_SPORTS_URL("https://www.thesportsdb.com/api/v1/json/1/all_sports.php"),
    ALL_SOCCER_LEAGUES_URL("https://www.thesportsdb.com/api/v1/json/1/all_leagues.php"),
    GET_LEAGUE_DETAILS_URL("https://www.thesportsdb.com/api/v1/json/1/lookupleague.php?id="),

    //General constants
    SOCCER("Soccer");

    private String value;

    SystemConstants(String value){
        this.value = value;
    }

    public String getValue(){
        return  value;
    }
}
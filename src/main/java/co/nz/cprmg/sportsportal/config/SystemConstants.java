package co.nz.cprmg.sportsportal.config;

public enum SystemConstants {

    //API SPORT URLS
    ALL_SPORTS_URL("https://www.thesportsdb.com/api/v1/json/1/all_sports.php"),
    ALL_LEAGUES_URL("https://www.thesportsdb.com/api/v1/json/1/all_leagues.php"),
    GET_LEAGUE_DETAILS_URL("https://www.thesportsdb.com/api/v1/json/1/lookupleague.php?id="),

    //General constants
    SOCCER("Soccer"),
    MOTORSPORTS("MotorSport"),
    FIGHTING("Fighting"),
    BASEBALL("Baseball"),
    BASKETBALL("Basketball"),
    AMERICAN_FOOTBALL("American Football"),
    ICE_HOCKEY("Ice Hockey"),
    GOLF("Golf");

    private String value;

    SystemConstants(String value){
        this.value = value;
    }

    public String getValue(){
        return  value;
    }
}

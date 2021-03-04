package co.nz.cprmg.sportsportal.model;

import java.util.ArrayList;
import java.util.List;

public class SportList {

    private List<Sport>  sports;

    public SportList(){
        sports = new ArrayList<Sport>();
    }

    public SportList(List<Sport> sports) {
        this.sports = sports;
    }

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }
}

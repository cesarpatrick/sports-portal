package co.nz.cprmg.sportsportal.model;

public class Sport {

    private Integer idSport;
    private String strSport;
    private String strFormat;
    private String strSportThumb;
    private String strSportThumbGreen;
    private String strSportDescription;

    public Integer getIdSport() {
        return idSport;
    }

    public void setIdSport(Integer idSport) {
        this.idSport = idSport;
    }

    public String getStrSport() {
        return strSport;
    }

    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    public String getStrFormat() {
        return strFormat;
    }

    public void setStrFormat(String strFormat) {
        this.strFormat = strFormat;
    }

    public String getStrSportThumb() {
        return strSportThumb;
    }

    public void setStrSportThumb(String strSportThumb) {
        this.strSportThumb = strSportThumb;
    }

    public String getStrSportThumbGreen() {
        return strSportThumbGreen;
    }

    public void setStrSportThumbGreen(String strSportThumbGreen) {
        this.strSportThumbGreen = strSportThumbGreen;
    }

    public String getStrSportDescription() {
        return strSportDescription;
    }

    public void setStrSportDescription(String strSportDescription) {
        this.strSportDescription = strSportDescription;
    }
}

package co.nz.cprmg.sportsportal.model;

import javax.persistence.*;

@Entity
@Table(name="favourite")
public class Favourite {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private Integer id_league;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_league() {
        return id_league;
    }

    public void setId_league(Integer id_league) {
        this.id_league = id_league;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

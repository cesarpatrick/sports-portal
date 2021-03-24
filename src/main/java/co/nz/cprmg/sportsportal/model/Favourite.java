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
    private Integer id_club;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_club() {
        return id_club;
    }

    public void setId_club(Integer id_club) {
        this.id_club = id_club;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

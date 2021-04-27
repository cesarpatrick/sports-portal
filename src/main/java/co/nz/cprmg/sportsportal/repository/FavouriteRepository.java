package co.nz.cprmg.sportsportal.repository;

import co.nz.cprmg.sportsportal.model.Favourite;
import co.nz.cprmg.sportsportal.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FavouriteRepository extends CrudRepository<Favourite, Integer> {
    @Query ("select f from Favourite  f where f.id_league= ?1 and f.user.id= ?2")
    public Favourite getFavourite(Integer idLeague, Integer idUser);
}

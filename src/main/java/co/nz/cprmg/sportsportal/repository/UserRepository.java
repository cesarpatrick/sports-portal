package co.nz.cprmg.sportsportal.repository;

import co.nz.cprmg.sportsportal.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("from User u where  u.login= ?1 and u.password = ?2")
    public User getUserByLoginAndPassword(String login, String password);
}

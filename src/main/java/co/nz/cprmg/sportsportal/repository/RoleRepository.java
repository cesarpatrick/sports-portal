package co.nz.cprmg.sportsportal.repository;

import co.nz.cprmg.sportsportal.model.ERole;
import co.nz.cprmg.sportsportal.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

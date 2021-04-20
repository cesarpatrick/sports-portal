package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.ERole;
import co.nz.cprmg.sportsportal.model.Role;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(ERole name);
}

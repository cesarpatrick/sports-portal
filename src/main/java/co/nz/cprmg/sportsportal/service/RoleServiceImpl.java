package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.ERole;
import co.nz.cprmg.sportsportal.model.Role;
import co.nz.cprmg.sportsportal.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    @Override
    public Optional<Role> findByName(ERole name){
        return roleRepository.findByName(name);
    }
}

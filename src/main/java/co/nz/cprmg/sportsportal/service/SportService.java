package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.model.SportList;
import org.springframework.http.ResponseEntity;

public interface SportService {
    ResponseEntity<SportList> getAllSports();
}

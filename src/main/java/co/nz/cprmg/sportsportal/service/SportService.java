package co.nz.cprmg.sportsportal.service;

import co.nz.cprmg.sportsportal.config.SystemConstants;
import co.nz.cprmg.sportsportal.model.SportList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SportService {

    public ResponseEntity<SportList> getAllSports(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SportList> response =
                restTemplate.getForEntity(
                        SystemConstants.ALL_SPORTS_URL.getValue(),
                        SportList.class);
        return response;
    }
}

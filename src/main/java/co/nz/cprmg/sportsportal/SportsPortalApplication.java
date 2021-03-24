package co.nz.cprmg.sportsportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan(basePackages = {
        "co.nz.cprmg.sportsportal.model"
})
@EnableJpaRepositories(basePackages = {
        "co.nz.cprmg.sportsportal.repository"
})
public class SportsPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportsPortalApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

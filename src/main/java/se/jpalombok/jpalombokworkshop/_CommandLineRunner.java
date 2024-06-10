package se.jpalombok.jpalombokworkshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.jpalombok.jpalombokworkshop.entity.AppUser;
import se.jpalombok.jpalombokworkshop.entity.Details;
import se.jpalombok.jpalombokworkshop.repository.AppUserRepository;
import se.jpalombok.jpalombokworkshop.repository.DetailsRepository;

import java.time.LocalDate;

@Component
public class _CommandLineRunner implements CommandLineRunner {

   @Autowired
   AppUserRepository appUserRepository;

   @Autowired
    DetailsRepository detailsRepository;

    @Override
    public void run(String... args) throws Exception {

//        Details details1 = new Details("Person1","person1@gmail.com", LocalDate.now());
//        AppUser appuser1 = new AppUser("Person1","Password",details1);
//        appUserRepository.save(appuser1);

    }
}

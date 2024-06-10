package se.jpalombok.jpalombokworkshop.repository;

import se.jpalombok.jpalombokworkshop.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer>{
    Optional<AppUser> findById(int id);
    Optional<AppUser> findByUserName(String username);
    List<AppUser> findByRegDateBetween(LocalDate start, LocalDate end);
    Optional<AppUser> findByUserDetailsId(int id);
    Optional<AppUser> findByEmail(String email);

}

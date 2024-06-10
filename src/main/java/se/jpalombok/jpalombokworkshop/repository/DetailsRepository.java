package se.jpalombok.jpalombokworkshop.repository;

import se.jpalombok.jpalombokworkshop.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailsRepository extends JpaRepository<Details,Integer> {
    <Optional>Details findDetailsById(int id);
    <Optional>Details findByEmail(String email);
    List<Details> findByNameContains(String name);
    List<Details> findByNameContainsIgnoreCase(String name);

}

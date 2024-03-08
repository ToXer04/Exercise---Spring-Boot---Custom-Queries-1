package develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.repositories;

import develhope.exercise.Exercise.Spring.Boot.Custom.Queries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
}

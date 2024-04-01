package fr.lesformulix.repositories;

import fr.lesformulix.models.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentRepository extends JpaRepository<Continent, Integer> {
}

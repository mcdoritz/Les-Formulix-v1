package fr.lesformulix.repositories;

import fr.lesformulix.models.Weekend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeekendRepository extends JpaRepository<Weekend, Integer> {
}

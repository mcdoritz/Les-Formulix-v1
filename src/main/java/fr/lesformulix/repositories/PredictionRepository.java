package fr.lesformulix.repositories;

import fr.lesformulix.models.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredictionRepository extends JpaRepository<Prediction, Integer> {
}

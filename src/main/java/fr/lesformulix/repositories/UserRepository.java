package fr.lesformulix.repositories;

import fr.lesformulix.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

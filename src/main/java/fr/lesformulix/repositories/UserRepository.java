package fr.lesformulix.repositories;

import fr.lesformulix.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByLeague(int league);

}

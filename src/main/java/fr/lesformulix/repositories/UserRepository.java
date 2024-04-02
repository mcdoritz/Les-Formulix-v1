package fr.lesformulix.repositories;

import fr.lesformulix.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u JOIN u.leagues l WHERE l.id = :league_id")
    List<User> findAllByLeagues(int league);

    User findByUsername(String username);

    User findByEmail(String email);

}

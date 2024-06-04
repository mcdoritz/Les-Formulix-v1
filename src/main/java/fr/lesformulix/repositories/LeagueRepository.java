package fr.lesformulix.repositories;

import fr.lesformulix.models.League;
import fr.lesformulix.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LeagueRepository extends JpaRepository<League, Integer> {

    /*@Query("SELECT league FROM League league " +
            "JOIN LeagueUser league_id " +
            "JOIN LeagueUser user_id " +
            "WHERE user_id = :userId")*/
    @Query("SELECT DISTINCT leagueUser.league FROM LeagueUser leagueUser WHERE leagueUser.user.id = :userId")
    List<League> findAllLeaguesByUser(@Param("userId") int userId);


}

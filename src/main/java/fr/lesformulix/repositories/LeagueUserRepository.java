package fr.lesformulix.repositories;

import fr.lesformulix.models.League;
import fr.lesformulix.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LeagueUserRepository extends JpaRepository<League, Integer> {

    @Query("SELECT leagueUser.user FROM LeagueUser leagueUser WHERE leagueUser.user.id = :userId AND leagueUser.league.id = :leagueId")
    User findByUserIdAndLeagueId(@Param("userId") int userId, @Param("leagueId") int leagueId);


}

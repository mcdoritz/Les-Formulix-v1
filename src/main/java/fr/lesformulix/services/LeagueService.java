package fr.lesformulix.services;

import fr.lesformulix.models.League;
import fr.lesformulix.models.User;
import fr.lesformulix.repositories.LeagueRepository;
import fr.lesformulix.repositories.LeagueUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LeagueService {
    @Autowired
    private LeagueRepository repo;
    @Autowired
    private LeagueUserRepository repoLU;

    // READ ----------------------------------------------------------------------------------------------

    public List<League> getAllLeaguesByUser(int user_id) {
        List<League> list = new ArrayList<>(repo.findAllLeaguesByUser(user_id));
        return list;
    }

    public League getLeague(int league_id){
        Optional<League> optionalLeague = repo.findById(league_id);
        if(optionalLeague.isPresent()){
            League league = optionalLeague.get();
            return league;
        }else{
            return null;
        }

    }

    public Boolean isThisUserInThisLeague(int user_id, int league_id){

        return false;
    }
}

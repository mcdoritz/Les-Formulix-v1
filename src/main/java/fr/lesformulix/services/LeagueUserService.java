package fr.lesformulix.services;

import fr.lesformulix.repositories.LeagueUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueUserService {
    @Autowired
    private LeagueUserRepository repo;

    public Boolean checkIsUserIsInThisLeague(int user_id, int league_id){
        if(user_id > 0 && league_id > 0){
            if(repo.findByUserIdAndLeagueId(user_id, league_id) != null){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}

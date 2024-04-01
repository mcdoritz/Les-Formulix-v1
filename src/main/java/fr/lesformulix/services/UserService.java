package fr.lesformulix.services;

import fr.lesformulix.models.User;
import fr.lesformulix.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static fr.lesformulix.utils.DebugUtil.pr;

@Service
public class UserService {
    @Autowired
    UserRepository repo;

    // CRUD

    // CREATE ----------------------------------------------------------------------------------------------

    public List<User> getAllUsersFromLeague(int league_id) {
        List<User> list = new ArrayList<>(repo.findAllByLeague(league_id));
        return list;
    }

    // READ ----------------------------------------------------------------------------------------------

    // UPDATE ----------------------------------------------------------------------------------------------

    // DELETE ----------------------------------------------------------------------------------------------


}

package fr.lesformulix.services;

import fr.lesformulix.models.User;
import fr.lesformulix.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

import static fr.lesformulix.utils.DebugUtil.prln;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    // CRUD

    // CREATE ----------------------------------------------------------------------------------------------

    public User add(User user, BindingResult bindingResult){

        //Faire d'abord la vérification que username ou email existe

        if(repo.findByUsername(user.getUsername()) != null || repo.findByEmail(user.getEmail()) != null){

            if(repo.findByUsername(user.getUsername()) != null) {
                bindingResult.addError(new FieldError("user", "username", "Nom d'utilisateur déjà pris"));
            }

            if(repo.findByEmail(user.getEmail()) != null){
                bindingResult.addError(new FieldError("user", "username", "Email déjà enregistré"));
            }
        }else{
            //Après on vérifie que tous les champs sont remplis correctement
            //Test




            // Si all is ok, hashage mdp et remonte ton slibard lothar

            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            prln(user.getPassword() + user.getPassword().length());
            repo.save(user);
        }
        return user;
    }

    // READ ----------------------------------------------------------------------------------------------

    public List<User> getAllUsersFromLeague(int league_id) {
        List<User> list = new ArrayList<>(repo.findAllByLeagues(league_id));
        return list;
    }

    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public User getByUsername(String username) {
        return repo.findByUsername(username);
    }

    // UPDATE ----------------------------------------------------------------------------------------------

    // DELETE ----------------------------------------------------------------------------------------------


}

package fr.lesformulix.services;

import fr.lesformulix.models.User;
import fr.lesformulix.models.UserLogin;
import fr.lesformulix.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static fr.lesformulix.utils.DebugUtil.prln;

@Service
public class UserLoginService implements UserDetailsService {
    @Autowired
    private UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String emailUsername) throws UsernameNotFoundException {
        User user;
        prln("Login utilisé : " + emailUsername);
        if(emailUsername.contains("@")){
            prln("L'utilisateur semble avoir utilisé un email");
            user = ur.findByEmail(emailUsername);
        }else{
            prln("L'utilisateur semble avoir utilisé un username");
            user = ur.findByUsername(emailUsername);
        }
        if(user == null){
            prln("Utilisateur non trouvé");
            throw new UsernameNotFoundException(emailUsername);
        }

        return new UserLogin(user);
    }
}

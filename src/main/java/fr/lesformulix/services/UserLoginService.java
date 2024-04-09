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
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user;
        if(login.contains("@")){
            user = ur.findByEmail(login);
        }else{
            user = ur.findByUsername(login);
        }
        if(user == null){
            throw new UsernameNotFoundException(login);
        }

        return new UserLogin(user);
    }
}

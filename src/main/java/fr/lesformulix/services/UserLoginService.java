package fr.lesformulix.services;

import fr.lesformulix.models.User;
import fr.lesformulix.models.UserLogin;
import fr.lesformulix.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static fr.lesformulix.utils.DebugUtil.prln;

@Service
public class UserLoginService implements UserDetailsService {
    @Autowired
    private UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user;
        prln("Login utilisé : " + username);
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String password = request.getParameter("password");
        prln("Mot de passe saisi par l'utilisateur: " + password);

        if(username.contains("@")){
            prln("L'utilisateur semble avoir utilisé un email");
            user = ur.findByEmail(username);
        }else{
            prln("L'utilisateur semble avoir utilisé un username");
            user = ur.findByUsername(username);
        }
        if(user == null){
            prln("Utilisateur non trouvé");
            throw new UsernameNotFoundException(username);
        }else{
            prln("Utilisateur trouvé: " + user.getUsername());
        }
        prln("Password attendu : " + user.getPassword());
        return new UserLogin(user);
    }
}

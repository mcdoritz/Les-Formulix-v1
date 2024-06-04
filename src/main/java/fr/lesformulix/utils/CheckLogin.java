package fr.lesformulix.utils;

import fr.lesformulix.models.User;
import fr.lesformulix.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import static fr.lesformulix.utils.DebugUtil.prln;

@Component
public class CheckLogin {
    @Autowired
    UserService us;

    public User checkLogin(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        prln("Authentication: " + authentication.getName());
        return us.getByUsername(authentication.getName());
    }

}
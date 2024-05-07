package fr.lesformulix.utils;

import fr.lesformulix.models.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import static fr.lesformulix.utils.DebugUtil.*;

public class SessionUtil {

    /*
    Check la connexion du user ou non.
    Return true ou false.
     */
    public static Boolean isUserConnected(HttpServletRequest request) throws Exception {
        prln("isUserConnected ? ");
        HttpSession session = request.getSession(false);
        if (session != null) {
            pr("Session pas nulle. ");
            if (session.getAttribute("user") != null) {
                pr("User trouvé dans la session : ");
                User user = (User) session.getAttribute("user");
                if (user.getId() > 0) {
                    pr(user.getUsername() + " est connecté.");
                    return true;
                }else {
                    session.invalidate();
                    throw new Exception("Erreur fatale avec l'id de l'user.");
                }
            }else {
                pr("Pas de user connecté.");
                return false;
            }
        }else {
            pr("Pas de session. Pas de user connecté. Pas de user connecté, pas de palais. Pas de palais, pas de palais.");
            return false;
        }
    }
}

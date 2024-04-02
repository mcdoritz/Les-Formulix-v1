package fr.lesformulix;

import fr.lesformulix.models.User;
import fr.lesformulix.repositories.UserRepository;
import fr.lesformulix.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static fr.lesformulix.utils.DebugUtil.prln;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserServiceTest {

    @Mock
    private UserRepository repoMock;

    @InjectMocks
    private UserService service;

    @Test
    public void testGetAllUsersFromLeague(){
        int leagueId = 123;
        List<User> userList = new ArrayList<>();

        // Définir le comportement attendu du repository mocké
        when(repoMock.findAllByLeagues(leagueId)).thenReturn(userList);

        // Appeler la méthode à tester
        List<User> result = service.getAllUsersFromLeague(leagueId);

        // Vérifier que la méthode a renvoyé les données attendues
        try{
            assertEquals(userList, result);
            prln("\n\u001B[32m" + getClass().getSimpleName() + " : ok \n");
        } catch (AssertionError e){
            prln("\n\u001B[31m erreur " + getClass().getSimpleName() + " : " + e.getMessage() +"\n");
        }


    }

}

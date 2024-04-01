package fr.lesformulix.repositories;

import fr.lesformulix.models.Nickname;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NicknameRepository extends JpaRepository<Nickname, Integer> {
}

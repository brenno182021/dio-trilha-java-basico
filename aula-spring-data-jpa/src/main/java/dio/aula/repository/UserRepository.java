package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {


    List<User> findByNameContaining(String name);

    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);

    User findByUserName(String userName);
}

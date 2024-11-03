package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Glayson");
//        user.setUserName("brenno");
//        user.setPassword("123");
//
//        userRepository.save(user);
//
//        userRepository.findAll().forEach(System.out::println);

//        List<User> users = userRepository.filtrarPorNome("Glayson");
        List<User> users = userRepository.findByNameContaining("Glayson");
        users.forEach(System.out::println);
    }
}

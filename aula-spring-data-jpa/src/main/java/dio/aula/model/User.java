package dio.aula.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.util.UUID;

@Entity
@Table(name = "tab_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Comment("id do usuario")
    private UUID id;

    @Column(length = 50, nullable = false)
    @Comment("nome do usuario")
    private String name;
    @Column(length = 20, nullable = false)
    @Comment("UserName do usuario")
    private String userName;
    @Column(length = 100, nullable = false)
    @Comment("Senha do usuario")
    private String password;

    public User() {
    }

    public User(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tamanho id: " + id.toString().length() +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

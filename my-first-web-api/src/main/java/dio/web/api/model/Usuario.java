package dio.web.api.model;

public class Usuario {
    private Integer id;
    private String login;
    private String password;

    public Usuario() {
    }

    public Usuario(Integer id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

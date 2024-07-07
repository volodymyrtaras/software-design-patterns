package vtaras.patterns.additional.mvc;

public class UserView {

    public String displayUserDetails(String username, String email) {
        return "Username: " + username + ", Email: " + email;
    }
}

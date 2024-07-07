package vtaras.patterns.additional.mvvm;

/*
 * MVVM is a design pattern that separates an application into model (data and logic), view (user interface), and view model (mediator)
 *
 * It promotes maintainability and testability by isolating UI logic from business logic
 */
public class UserViewModel {

    private final UserModel model;

    public UserViewModel(UserModel model) {
        this.model = model;
    }

    public String getUsername() {
        return model.getUsername();
    }

    public void setUsername(String username) {
        model.setUsername(username);
    }

    public String getEmail() {
        return model.getEmail();
    }

    public void setEmail(String email) {
        model.setEmail(email);
    }
}

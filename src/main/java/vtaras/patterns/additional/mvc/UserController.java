package vtaras.patterns.additional.mvc;

/**
 * The MVC pattern separates an application into three components: the model (data and business logic), the view (presentation of data), and the controller (handles input and
 * updates the model and view) This separation promotes modular development, improves maintainability, and facilitates reusability of components within the software architecture
 */
public class UserController {

    private final UserModel model;
    private final UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setUsername(String username) {
        model.setUsername(username);
    }

    public void setEmail(String email) {
        model.setEmail(email);
    }

    public String updateUserView() {
        return view.displayUserDetails(model.getUsername(), model.getEmail());
    }
}

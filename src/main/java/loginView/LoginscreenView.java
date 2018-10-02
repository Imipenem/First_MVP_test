package loginView;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public interface LoginscreenView {
    void initComponents(Stage primaryStage);
    void printLoginSuccessfull();
    void printLoginFailed();
    Button getLoginButton();
    String getUsernameField();
    String getPasswordField();
}

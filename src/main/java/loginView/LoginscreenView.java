package loginView;

import javafx.stage.Stage;
import loginPresenter.LoginscreenPresenter;

public interface LoginscreenView {
    LoginscreenPresenter getLoginPresenter();
    void setLoginPresenter(LoginscreenPresenter loginPresenter);
    void initComponents(Stage primaryStage);
    void printLoginSuccessfull();
    void printLoginFailed();
    void updateModelFromView();
}

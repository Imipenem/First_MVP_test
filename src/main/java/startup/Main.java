package main.java.startup;

import javafx.application.Application;
import javafx.stage.Stage;
import main.java.loginPresenter.LoginScreenImpl;
import main.java.loginPresenter.LoginscreenPresenter;
import main.java.loginView.LoginScreenViewImpl;
import main.java.loginView.LoginscreenView;
import main.java.model.LoginModel;
import main.java.model.LoginModelImpl;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        LoginscreenPresenter presenter = new LoginScreenImpl();
        LoginscreenView view = new LoginScreenViewImpl(primaryStage);
        LoginModel model = new LoginModelImpl();
        presenter.setLoginModel(model);
        ((LoginScreenImpl) presenter).setLoginView(view);
        ((LoginScreenImpl) presenter).run();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
package startup;

import javafx.application.Application;
import javafx.stage.Stage;
import loginPresenter.LoginScreenImpl;
import loginPresenter.LoginscreenPresenter;
import loginView.LoginScreenViewImpl;
import model.LoginModel;
import model.LoginModelImpl;

public class Main extends Application {

    private LoginscreenPresenter presenter = new LoginScreenImpl();
    private LoginModel model = new LoginModelImpl();

    @Override
    public void start(Stage primaryStage) {
        presenter.setLoginModel(model);
        ((LoginScreenImpl) presenter).setLoginView(new LoginScreenViewImpl(primaryStage));
        ((LoginScreenImpl) presenter).run();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
package loginPresenter;

import loginView.LoginscreenView;
import model.LoginModel;

public class LoginScreenImpl implements LoginscreenPresenter {

LoginscreenView loginView;
LoginModel loginModel;


    @Override
    public void handleLogin(String username, String password) {
        updateModelFromPresenter();
        if (getLoginModel().getUsername().equals("CarlosMatos") && getLoginModel().getPassword().equals("BitconnectIsNoScam")) {
            getLoginView().printLoginSuccessfull();
        }
        else {
            getLoginView().printLoginFailed();
        }
    }

    public void run() {
        loginModel.setUsername("Test");
        loginModel.setPassword("Anfang");
        setListenerForLoginButton();
    }

    public void updateModelFromPresenter() {
        loginModel.setUsername(loginView.getUsernameField());
        loginModel.setPassword(loginView.getPasswordField());
    }
    @Override
    public void setListenerForLoginButton() {
        loginView.getLoginButton().setOnAction(e-> handleLogin(loginView.getUsernameField(),loginView.getPasswordField()));
    }


    public void setLoginView(LoginscreenView loginView) {
        this.loginView = loginView;
    }

    public LoginscreenView getLoginView() {

        return loginView;
    }

    @Override
    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public LoginModel getLoginModel() {
        return loginModel;
    }
}

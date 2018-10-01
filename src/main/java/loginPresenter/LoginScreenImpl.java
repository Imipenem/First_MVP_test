package main.java.loginPresenter;

import main.java.loginView.LoginscreenView;
import main.java.model.LoginModel;

public class LoginScreenImpl implements LoginscreenPresenter{

LoginscreenView loginView;
LoginModel loginModel;


    @Override
    public void handleLogin(String username, String password) {
        loginView.updateModelFromView();
        if (loginModel.getUsername().equals("CarlosMatos") && loginModel.getPassword().equals("BitconnectIsNoScam")) {
            getLoginView().printLoginSuccessfull();
        }
        else {
            getLoginView().printLoginFailed();
        }
    }

    public void run() {
        //setLoginView(loginView);
        //setLoginModel(loginModel);
        loginModel.setUsername("Test");
        loginModel.setPassword("Anfang");
        loginView.setLoginPresenter(this);
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

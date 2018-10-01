package loginPresenter;

import model.LoginModel;

public interface LoginscreenPresenter {
    void setLoginModel(LoginModel loginModel);
    LoginModel getLoginModel();
    void handleLogin(String username,String password);
}

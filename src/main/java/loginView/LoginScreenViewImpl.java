package loginView;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class LoginScreenViewImpl implements LoginscreenView{

    TextField nameInput = new TextField();
    TextField passwordInput = new TextField();
    Button logInButton;



    public LoginScreenViewImpl(Stage primaryStage) {
        initComponents(primaryStage);
    }

    @Override
    public void initComponents(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label UserName = new Label("Username:");
        UserName.setTextFill(Paint.valueOf("red"));
        GridPane.setConstraints(UserName, 0, 0);
        UserName.prefHeight(40);


        GridPane.setConstraints(nameInput, 1, 0);
        nameInput.setPromptText("Username");
        nameInput.setPrefHeight(40);

        Label password = new Label("Password:");
        password.setTextFill(Paint.valueOf("red"));
        GridPane.setConstraints(password, 0, 1);
        password.prefHeight(40);


        GridPane.setConstraints(passwordInput, 1, 1);
        passwordInput.setPrefHeight(40);


        logInButton = new Button("Log in");
        GridPane.setConstraints(logInButton, 0, 2);
        logInButton.prefWidthProperty().bind(grid.widthProperty());
        logInButton.prefHeightProperty().bind(grid.heightProperty());
        logInButton.setMaxHeight(40);
        logInButton.setDefaultButton(true);

        grid.getChildren().addAll(UserName, nameInput, password, passwordInput,logInButton);

        Scene scene = new Scene(grid, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome to Medical_Data Plot");
        primaryStage.show();
    }

    @Override
    public void printLoginSuccessfull() {
        System.out.println("Login erfolgreich!");
    }

    @Override
    public void printLoginFailed() {
        System.out.println("Login nicht erfolgreich!");

    }

    @Override
    public Button getLoginButton() {
        return logInButton;
    }

    @Override
    public String getUsernameField() {
        return nameInput.getText();
    }

    @Override
    public String getPasswordField() {
        return passwordInput.getText();
    }
}

package controller;

import controller.model.Account;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class NavigatieController {

    @FXML
    private AnchorPane rootPane;

    public void loginscherm() throws IOException {
        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/inlogscherm.fxml")));
        rootPane.getChildren().setAll(pane);
    }

    public void registratie() throws IOException {
        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/registratie.fxml")));
        rootPane.getChildren().setAll(pane);
    }



    public void toLogin() throws  IOException{
        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/inlogscherm.fxml")));
        rootPane.getChildren().setAll(pane);
    }

    public void logout() throws IOException{
        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/inlogscherm.fxml")));
        rootPane.getChildren().setAll(pane);
        Objects.requireNonNull(Account.checkIngelogdeKlant()).klantUitloggen();
    }

    public void toHomescreen() throws IOException{
        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/home.fxml")));
        rootPane.getChildren().setAll(pane);
    }

    public void toLessen() throws IOException{
        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/Lessen.fxml")));
        rootPane.getChildren().setAll(pane);
    }


}
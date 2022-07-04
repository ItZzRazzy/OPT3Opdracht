package controller;

import controller.model.Klant;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class InlogController extends NavigatieController implements Initializable {

    @FXML
    Label kanNietInloggen;

    @FXML
    TextField username;

    @FXML
    PasswordField wachtwoord;




    public void loginCheck(MouseEvent mouseEvent) throws IOException {


        for(Klant i: Klant.getKlantList()){
            if(username.getText().equals(i.getUsername())&& wachtwoord.getText().equals(i.getWachtwoord())){
                i.setHuidigeKlant(true);
                toHomescreen();
            }
            else{
                fouteInlog();
            }
        }
    }

    public void fouteInlog(){
        kanNietInloggen.setText("Inloggen gefaald, probeer opnieuw");

        kanNietInloggen.setVisible(true);
    }



















    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("De klant is uitgelogd");
        System.out.println("De klant is uitgelogd");
    }
}

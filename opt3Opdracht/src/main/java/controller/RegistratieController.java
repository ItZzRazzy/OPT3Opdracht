package controller;

import controller.model.Klant;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class RegistratieController extends NavigatieController {

    public Label registratieLabel;



    @FXML
    private TextField registratieUsername;
    @FXML
    private PasswordField registratieWachtwoord;
    @FXML
    private PasswordField registratieWachtwoordConfirm;
    @FXML
    private TextField naam;
    @FXML
    private TextField mail;
    @FXML
    private TextField telNr;

    public void register() {
        boolean accountBestaatAl = false;
        for (Klant k: Klant.getKlantList()
             ) {
            if (registratieUsername.getText().equals(k.getUsername())) {
                accountBestaatAl = true;
            }
        }



        if (accountBestaatAl) {
            System.out.println();
            registratieLabel.setText("Gebruikersnaam is al in gebruik");
        }
        else {

            if (registratieUsername.getText().isBlank() ||  registratieUsername.getText().isEmpty()) {
                registratieLabel.setText("Voer een geldig gebruikersnaam in");
            } else {
                if (registratieWachtwoord.getText().isBlank() ||  registratieWachtwoord.getText().isEmpty() ||
                        registratieWachtwoordConfirm.getText().isBlank() || registratieWachtwoordConfirm.getText().isEmpty()) {
                    registratieLabel.setText("Voer een geldig wachtwoord in");
                }
                else{
                    if (!registratieWachtwoord.getText().equals(registratieWachtwoordConfirm.getText())) {
                        registratieLabel.setText("Wachtwoorden komen niet overeen");
                    } else {
                        if (registratieWachtwoord.getText().equals(registratieWachtwoordConfirm.getText())) {

                            Klant oof = new Klant(registratieUsername.getText(), naam.getText(), mail.getText(), telNr.getText(), registratieWachtwoord.getText());
                            registratieLabel.setTextFill(Color.GREEN);
                            registratieLabel.setText("Account aangemaakt");
                        }
                    }
                }
            }
        }
    }
}

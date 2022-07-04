package controller;
import controller.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LessenController extends NavigatieController implements Initializable {

    @FXML
    ChoiceBox<String> lesKeuze;
    @FXML
    ChoiceBox<String> tijdstip;
    @FXML
    DatePicker datumPicker;
    @FXML
    Button inplanButton;
    @FXML
    private TableView<Les> lesOverzicht;
    @FXML
    private TableColumn<Les, String> Datum;

    @FXML
    private TableColumn<Les, String> lessetjes;
    @FXML
    private TableColumn<Les, String> Tijdstip;
    @FXML
    private Label huidigeKlant;
    @FXML
    private Label lesInplannenLabel;

ObservableList<Les> list = FXCollections.observableArrayList(Klant.checkIngelogdeKlant().getLessen());



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(Account.checkIngelogdeKlant().isIngelogd()){
            huidigeKlant.setText(Account.checkIngelogdeKlant().getNaam());

        }
        tableviewUpdate();
    lesKeuze();
    tijdstip();

    }
    public void lesButtonPressed() throws IOException {
        if(checkTijdstip())
        lesInplannen();
        tableviewUpdate();
    }




    public void lesKeuze(){

        lesKeuze.getItems().add("Pianoles");
        lesKeuze.getItems().add("Dirigentles");
        lesKeuze.getItems().add("Klarinetles");
    }
    public void tijdstip(){
        int uur = 8;
        int minuut = 0;
        for(int i = 0; i < 17; i++) {
            for (int j = 0; j < 1; j++)
            if(minuut  == 0){
                tijdstip.getItems().add(uur + ":" + minuut + "0");
            }
            else {
                tijdstip.getItems().add(uur + ":" + minuut);
            }
            minuut += 30;
            if(minuut == 60){
                uur++;
                minuut = 0;
            }
        }
    }
    public boolean checkTijdstip(){
        for (Klant k: Klant.getKlantList()) {
            for (Les l: k.getLessen()) {
                if(datumPicker.getValue().toString().equals(l.getDatum())){
                    if(tijdstip.getValue().equals(l.getTijdstip())) {
                        lesInplannenLabel.setText("Les kan niet worden ingeplanned, \n omdat het tijdstip al bezet is.");
                        return false;}
                }
            }
        }
        lesInplannenLabel.setText("");
        return true;
    }
    public void lesInplannen(){
        String keuze = lesKeuze.getValue();
        switch (keuze){
            case "Pianoles":
                Klant.checkIngelogdeKlant().setLessen(new PianoLes(Klant.checkIngelogdeKlant(),lesKeuze.getValue(), datumPicker.getValue().toString(), tijdstip.getValue()));
                break;
            case "Dirigentles":
                Klant.checkIngelogdeKlant().setLessen(new DirigentLes(Klant.checkIngelogdeKlant(),lesKeuze.getValue(), datumPicker.getValue().toString(), tijdstip.getValue()));
                break;
            case "Klarinetles":
                Klant.checkIngelogdeKlant().setLessen(new KlarinetLes(Klant.checkIngelogdeKlant(), lesKeuze.getValue(), datumPicker.getValue().toString(), tijdstip.getValue()));
                break;
        }
    }
    public void tableviewUpdate(){

        lessetjes.setCellValueFactory(new PropertyValueFactory<Les, String>("lesType"));
        Datum.setCellValueFactory(new PropertyValueFactory<Les, String>("datum"));
        Tijdstip.setCellValueFactory(new PropertyValueFactory<Les, String>("tijdstip"));
        lesOverzicht.setItems(list);
        list.clear();
        list.addAll(Klant.checkIngelogdeKlant().getLessen());
    }

}

package controller;

import controller.model.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController extends NavigatieController implements Initializable {


    @FXML
    private AnchorPane rootPane;

    @FXML
    private ImageView Home;

    @FXML
    private ImageView naarLessenKnop;

    @FXML
    private ImageView Logout;

    @FXML
    private Label huidigeKlant;
    @FXML
    private Button dirigentPrintButton;
    @FXML
    private Button klarinetPrintButton;
    @FXML
    private Button pianoPrintButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(Account.checkIngelogdeKlant().isIngelogd()){
            huidigeKlant.setText(Account.checkIngelogdeKlant().getNaam());
            Observable observable = new Observable();
            observable.setSubscribers();
            observable.dataNaarSubscribers();

        }
    }

    public void printDirigent(){
        LesInfo lesInfo = new DirigentLesInfo();
        lesInfo.lesInfo();
    }

    public void printKlarinet(){
        LesInfo lesInfo = new KlarinetLesInfo();
        lesInfo.lesInfo();
    }
    public void printPiano(){
        LesInfo lesInfo = new PianoLesInfo();
        lesInfo.lesInfo();
    }
   // public void printInfo() {
//            System.out.println(lesInfo.getKlant().getNaam());
//            System.out.println(lesInfo.getLesType());
//            System.out.println(lesInfo.getPrijs() + "euro");
//            System.out.println(lesInfo.getTijdsduurInMinuten() + "minuten");
//            System.out.println(lesInfo.getDatum());
//            System.out.println(lesInfo.getTijdstip());



 //   }

}


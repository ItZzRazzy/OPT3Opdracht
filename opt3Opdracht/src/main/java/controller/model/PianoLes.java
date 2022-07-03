package controller.model;

public class PianoLes extends Les {


    public PianoLes(Klant klant, String lestype, String datum, String tijdstip) {

        this.klant = klant;
        this.lesType = lestype;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.klant.setBedragTeBetalen(75);
        this.tijdsduurInMinuten = "90";
        this.prijs = 75;
    }


}


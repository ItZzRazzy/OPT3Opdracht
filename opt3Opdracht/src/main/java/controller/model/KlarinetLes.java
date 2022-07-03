package controller.model;

public class KlarinetLes extends Les {



    public KlarinetLes(Klant klant, String lestype, String datum, String tijdstip) {

        this.klant = klant;
        this.lesType = lestype;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.klant.setBedragTeBetalen(40);
        this.tijdsduurInMinuten = "45";
        this.prijs = 40;

    }


}



package controller.model;

public class DirigentLes extends Les{



    public DirigentLes(Klant klant, String lestype, String datum, String tijdstip) {

        this.klant = klant;
        this.lesType = lestype;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.klant.setBedragTeBetalen(50);
        this.tijdsduurInMinuten = "60";
        this.prijs = 50;
    }



    }


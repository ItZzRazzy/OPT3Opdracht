package controller.model;

public class PianoLes extends Les {


    public PianoLes(Klant klant, String lestype, String datum, String tijdstip) {

        this.klant = klant;
        this.lesType = lestype;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.klant.setBedragTeBetalen(75);
        this.tijdsduurInMinuten = "90";
    }
    @Override
    public String getTijdsduurInMinuten() {
        return tijdsduurInMinuten;
    }
    @Override
    public Integer getPrijs(){
        return prijs;
    }
    @Override
    public String getTijdstip() {
        return this.tijdstip;
    }
    @Override
    public String getLesType(){
        return this.lesType;
    }
    @Override
    public String getDatum(){
        return this.datum;
    }

    @Override
    public Klant getKlant() {
        return klant;
    }

}


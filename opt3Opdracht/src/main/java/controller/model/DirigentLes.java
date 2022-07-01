package controller.model;

public class DirigentLes extends Les{



    public DirigentLes(Klant klant, String lestype, String datum, String tijdstip) {

        this.klant = klant;
        this.lesType = lestype;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.klant.setBedragTeBetalen(50);
        this.tijdsduurInMinuten = "60";
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


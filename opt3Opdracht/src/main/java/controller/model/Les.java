package controller.model;

public class Les {
    String lesType;
    String tijdstip;
    String datum;
    Integer prijs;
    String tijdsduurInMinuten;
    Klant klant;

    public Les(){

    }



    public String getTijdsduurInMinuten() {
        return tijdsduurInMinuten;
    }

    public Integer getPrijs(){
        return prijs;
    }

    public String getTijdstip() {
        return this.tijdstip;
    }

    public String getLesType(){
        return this.lesType;
    }

    public String getDatum(){
        return this.datum;
    }

    public Klant getKlant() {
        return klant;
    }
}

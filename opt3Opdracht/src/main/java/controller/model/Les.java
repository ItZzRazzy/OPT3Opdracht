package controller.model;

public abstract class Les {
    String lesType;
    String tijdstip;
    String datum;
    Integer prijs;
    String tijdsduurInMinuten;
    Klant klant;

    public Les(){

    }


    public abstract String getTijdsduurInMinuten();

    public abstract Integer getPrijs();

    public abstract String getTijdstip();
    public abstract String getLesType();
    public abstract String getDatum();
    public abstract Klant getKlant();
}

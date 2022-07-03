package controller.model;

public abstract class Les {
    String lesType;
    String tijdstip;
    String datum;


    Klant klant;

    public Les(){

    }






    public abstract String getTijdstip();
    public abstract String getLesType();
    public abstract String getDatum();
    public abstract Klant getKlant();
}

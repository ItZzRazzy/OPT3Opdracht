package controller.model;

public abstract class LesInfo {
    String lesType;
    String tijdstip;
    String datum;
    Integer prijs;
    String tijdsduurInMinuten;
    Klant klant;

    public void lesInfo(){
    printKlant();
    printLesType();
    printDatum();
    printTijdstip();
    }


    abstract void printLesType();
    abstract void printDatum();
    abstract void printKlant();
    abstract void printTijdstip();

    public String getLesType(){
return lesType;
    }
    public void setLesType(String lesType){
this.lesType = lesType;
    }
    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }


    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
    public String getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(String tijdstip) {
        this.tijdstip = tijdstip;
    }

}

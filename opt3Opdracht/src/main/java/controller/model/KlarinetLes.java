package controller.model;

public class KlarinetLes extends Les {



    public KlarinetLes(Klant klant, String lestype, String datum, String tijdstip) {

        this.klant = klant;
        this.lesType = lestype;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.klant.setBedragTeBetalen(40);


    }







    @Override
    public String getTijdstip() {
        if(this.lesType.equals("Klarinetles")){
            return tijdstip;
        }
        else{
            return "Verkeerde les";
        }
    }
    @Override
    public String getLesType(){
        if(this.lesType.equals("Klarinetles")){
            return this.lesType;
        }
        else{
            return "Verkeerde les";
        }

    }
    @Override
    public String getDatum(){
        if(this.lesType.equals("Klarinetles")){
            return this.datum;
        }
        else{
            return "Verkeerde les";
        }

    }
    @Override
    public Klant getKlant() {
        if (this.lesType.equals("Klarinetles")) {
            return klant;
        } else {
            return null;
        }
    }}



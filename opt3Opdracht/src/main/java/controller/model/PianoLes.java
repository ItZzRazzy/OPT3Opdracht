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
    @Override
    public String getTijdsduurInMinuten() {
        if(this.lesType.equals("Pianoles")){
            return tijdsduurInMinuten;
        }
        else{
            return "Verkeerde les";
        }

    }
    @Override
    public Integer getPrijs(){
        if(this.lesType.equals("Pianoles")){
            return prijs;
        }
        else{
            return null;
        }

    }
    @Override
    public String getTijdstip() {
        if(this.lesType.equals("Pianoles")){
            return tijdstip;
        }
        else{
            return "Verkeerde les";
        }
    }
    @Override
    public String getLesType(){
        if(this.lesType.equals("Pianoles")){
            return this.lesType;
        }
        else{
            return "Verkeerde les";
        }

    }
    @Override
    public String getDatum(){
        if(this.lesType.equals("Pianoles")){
            return this.datum;
        }
        else{
            return "Verkeerde les";
        }

    }
    @Override
    public Klant getKlant() {
        if (this.lesType.equals("Pianoles")) {
            return klant;
        } else {
            return null;
        }
    }}


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
    @Override
    public String getTijdsduurInMinuten() {
        if(this.lesType.equals("Dirigentles")){
            return tijdsduurInMinuten;
        }
        else{
            return "Verkeerde les";
        }

    }
    @Override
    public Integer getPrijs(){
        if(this.lesType.equals("Dirigentles")){
            return prijs;
        }
        else{
            return null;
        }

    }
    @Override
    public String getTijdstip() {
        if(this.lesType.equals("Dirigentles")){
            return tijdstip;
        }
        else{
            return "Verkeerde les";
        }
    }
    @Override
    public String getLesType(){
        if(this.lesType.equals("Dirigentles")){
            return this.lesType;
        }
        else{
            return "Verkeerde les";
        }

    }
    @Override
    public String getDatum(){
        if(this.lesType.equals("Dirigentles")){
            return this.datum;
        }
        else{
            return "Verkeerde les";
        }

    }
    @Override
    public Klant getKlant() {
        if(this.lesType.equals("Dirigentles")){
            return klant;
        }
        else{
            return null;
        }

    }



    }


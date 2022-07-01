package controller.model;
import java.util.ArrayList;

public class Klant extends Account{


    String naam;
    String mail;
    String telefoonnr;

    ArrayList<Les> lessen = new ArrayList<>();
    Integer bedragTeBetalen = 0;

    private static ArrayList<Klant> klantList = new ArrayList<>();

    public Klant(String username, String naam, String mail, String telefoonnr, String wachtwoord){
        super(username, wachtwoord);
        this.naam = naam;
        this.mail = mail;
        this.telefoonnr = telefoonnr;



        klantList.add(this);
    }

    public static ArrayList<Klant> getKlantList() {
        return klantList;
    }



    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public String getMail() {
        return this.mail;
    }

    @Override
    public String getTelefoonnr() {
        return this.telefoonnr;
    }

    public void setBedragTeBetalen(Integer prijs){
        this.bedragTeBetalen += prijs;
    }
    public Integer getBedragTeBetalen(){
        return bedragTeBetalen;
    }
    public void setLessen(Les les){
        lessen.add(les);
    }
    public ArrayList<Les> getLessen(){
        return lessen;
    }
}

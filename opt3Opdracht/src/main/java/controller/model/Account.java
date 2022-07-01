package controller.model;

public abstract class Account {

    private String username;
    private String wachtwoord;
    private boolean huidigeKlant;

    public Account(String username, String wachtwoord) {
        this.username = username;
        this.wachtwoord = wachtwoord;
    }




    public void setHuidigeKlant(boolean huidigeKlant) {
        this.huidigeKlant = huidigeKlant;
    }

    public boolean isIngelogd() {
        return huidigeKlant;
    }

    public void klantUitloggen() {
        for (Account i : Klant.getKlantList()) {
            if (i.isIngelogd()) {
                i.huidigeKlant = false;
            }
        }

    }
    public static Klant checkIngelogdeKlant() {

        for (Klant i : Klant.getKlantList()) {
            if (i.isIngelogd()) {
                return i;
            }
        }
        return null;
    }
    public String getUsername() {
        return username;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public abstract String getNaam();

    public abstract String getMail();

    public abstract String getTelefoonnr();
}



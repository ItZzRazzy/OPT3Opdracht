package controller.model;

public class PianoLesInfo extends LesInfo{
    @Override
    void printLesType() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {
            if(l.getLesType().equals("Pianoles")) {
                setLesType(l.getLesType());
                System.out.println(l.getLesType());
            }
        }

    }

    @Override
    void printPrijs() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Pianoles")){
            setPrijs(l.getPrijs());
            System.out.println(l.getPrijs() + " euro");}
        }
    }

    @Override
    void printTijdsduurInMinuten() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Pianoles")){
            setTijdsduurInMinuten(l.getTijdsduurInMinuten());
            System.out.println(l.getTijdsduurInMinuten() + " minuten");}
        }
    }

    @Override
    void printDatum() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Pianoles")){
            setDatum(l.getDatum());
            System.out.println(l.getDatum());}
        }
    }

    @Override
    void printKlant() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Pianoles")){
            setKlant(l.getKlant());
            System.out.println(l.getKlant().getNaam());}
        }
    }

    @Override
    void printTijdstip() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Pianoles")) {
            setTijdstip(l.getTijdstip());
            System.out.println(l.getTijdstip());
        }
        }
    }
}

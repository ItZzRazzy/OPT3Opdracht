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

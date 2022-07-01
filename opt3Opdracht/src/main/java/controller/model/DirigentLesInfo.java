package controller.model;

public class DirigentLesInfo extends LesInfo{
    @Override
    void printLesType() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {
            if(l.getLesType().equals("Dirigentles")) {
                setLesType(l.getLesType());
                System.out.println(l.getLesType());
            }
        }

    }

    @Override
    void printPrijs() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Dirigentles")){
            setPrijs(l.getPrijs());
            System.out.println(l.getPrijs() + " euro");}
        }
    }

    @Override
    void printTijdsduurInMinuten() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Dirigentles")){
            setTijdsduurInMinuten(l.getTijdsduurInMinuten());
            System.out.println(l.getTijdsduurInMinuten() + " minuten");}
        }
    }

    @Override
    void printDatum() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Dirigentles")){
            setDatum(l.getDatum());
            System.out.println(l.getDatum());}
        }
    }

    @Override
    void printKlant() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Dirigentles")){
            setKlant(l.getKlant());
            System.out.println(l.getKlant().getNaam());}
        }
    }

    @Override
    void printTijdstip() {
        for (Les l: Account.checkIngelogdeKlant().getLessen()
        ) {if(l.getLesType().equals("Dirigentles")) {
            setTijdstip(l.getTijdstip());
            System.out.println(l.getTijdstip());
        }
        }
    }
}

package controller;

import controller.model.Account;

import java.util.ArrayList;

public class Observable {
    static ArrayList<Observer> subscribers = new ArrayList<>();

    static ArrayList<Observer> leeg = new ArrayList<>();

    public void setSubscribers() {
        if (subscribers.equals(leeg)) {
            subscribers.add(new LoginListener(Account.checkIngelogdeKlant().isIngelogd()));
            subscribers.add(new LogoutListener(Account.checkIngelogdeKlant().isIngelogd()));
        }
    }


    public void dataNaarSubscribers() {
        for (Observer o: subscribers
             ) {
            o.refresh(Account.checkIngelogdeKlant().isIngelogd());
        }
    }


}


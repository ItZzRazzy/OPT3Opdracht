package controller;

public class LoginListener implements Observer{
    boolean login;

    public LoginListener(boolean login){
        this.login = login;
    }
    @Override
    public void refresh(boolean logger) {
        this.login = logger;

        System.out.println("Klant is ingelogd");
    }
}

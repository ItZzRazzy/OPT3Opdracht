package controller;

public class LogoutListener implements Observer{
    boolean logout;

    public LogoutListener(boolean logout){
        this.logout=logout;
    }
    @Override
    public void refresh(boolean logger) {
        this.logout = logger;

        System.out.println("Klant is ingelogd");
    }
}

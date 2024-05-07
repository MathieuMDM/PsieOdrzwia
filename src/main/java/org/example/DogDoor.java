package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private Bark allowedBarks;

    public Bark getAllowedBarks() {
        return allowedBarks;
    }

    public void setAllowedBark(Bark allowedBarks) {
        this.allowedBarks = allowedBarks;
    }

    public DogDoor() {
        this.open = false;
    }

    public void open(){
        System.out.println("Dzwiczki dla psa zostaly odtwarte");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        },5000); // 5 sekund
    }

    public void close(){
        System.out.println("Dzwiczki dla psa zostaly zamkniete");
        open = false;
    }

    public boolean isOpen(){ // metoda ktora zwraca wiadomosc czy dzwiczki sa odtwarte czy zamkniete
        return open;
    }
}

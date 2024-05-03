package org.example;

public class DogDoor {

    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open(){
        System.out.println("Dzwiczki dla psa zostaly odtwarte");
        open = true;
    }

    public void close(){
        System.out.println("Dzwiczki dla psa zostaly zamkniete");
        open = false;
    }

    public boolean isOpen(){ // metoda ktora zwraca wiadomosc czy dzwiczki sa odtwarte czy zamkniete
        return open;
    }
}

package org.example;
import java.util.Timer;
import java.util.TimerTask;

public class Remote {

    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Nacisnieto przycisk na pilocie ...");
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }
}

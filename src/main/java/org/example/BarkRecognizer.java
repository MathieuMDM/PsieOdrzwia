package org.example;

import java.util.List;

public class BarkRecognizer {

    private DogDoor door;

    public void recognize(Bark bark) {
        System.out.println(" BarkRecognizer: Usłyszano " + bark.getSound() + " .");

        List<Bark> allowedBarks = (List<Bark>) door.getAllowedBarks();
        for (Bark allowedBark : allowedBarks) {
            if (allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }
    }
}

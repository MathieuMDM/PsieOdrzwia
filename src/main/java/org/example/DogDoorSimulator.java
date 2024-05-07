package org.example;

public class DogDoorSimulator {
    public static void main(String[] agrs){

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Azor szczeka aby wyjsc na spacer");
        remote.pressButton();
        System.out.println("\nAzor wyszedl na spacer");

        System.out.println("\nAzor zalatwil co trzeba ...");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {

        }

        System.out.println("\nAzor utknol na zewnatrz ...");
        System.out.println("\nAzor szczeka");
        System.out.println("\n zatem Janka sienga po pilota");
        remote.pressButton();

        System.out.println("\nAzor wrocil do domu");

    }
}

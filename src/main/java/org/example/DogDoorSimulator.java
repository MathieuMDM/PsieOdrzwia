package org.example;

public class DogDoorSimulator {
    public static void main(String[] agrs){

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Azor szczeka aby wyjsc na spacer");
        remote.pressButton();
        System.out.println("\nAzor wyszedl na spacer");
        remote.pressButton();
        System.out.println("\nAzor zalatwil co trzeba ...");
        remote.pressButton();
        System.out.println("\nAzor wrocil do domu");
        remote.pressButton();
    }
}

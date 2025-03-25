package org.keyin.spaceship;

import java.util.Scanner;

public class SpaceShipMain {
    private static final SpaceShipService spaceShipService = new SpaceShipService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the SpaceShip you want to search!: ");
        String name = scanner.next();


        // Getting access to a spaceship from the db so we can access things from it!
        SpaceShip spaceShip2 = spaceShipService.getSpaceShipByName(name);

        // We have access to the name!
        System.out.println(spaceShip2.getName());

        // Based on the name I am going to route to a specific menu
        // In this example if I have a SpaceX spaceship that comes back from the search I will route to the SpaceX menu where IU can create a new space ship
        switch (spaceShip2.getName().toUpperCase()) {
            case "SPACEX" -> spaceXMenu(scanner);
            case "NASA" -> nasaMenu();
            case "BLUEORIGIN" -> blueOriginMenu();
            default -> System.out.println("Invalid SpaceShip Name");
        }
    }

    private static void blueOriginMenu() {
        System.out.println("Welcome to the Blue Origin Menu!");
    }

    private static void nasaMenu() {
        System.out.println("Welcome to the NASA Menu!");
    }

    private static void spaceXMenu(Scanner scanner) {
        System.out.println("Create A New SpaceShip!");
        System.out.println("=====================================");
        System.out.println("Enter the name of the SpaceShip: ");
        String name = scanner.next();
        System.out.println("Enter the model of the SpaceShip: ");
        String model = scanner.next();
        System.out.println("Enter the year the SpaceShip was built: ");
        int yearBuilt = scanner.nextInt();
        System.out.println("Enter the crew capacity of the SpaceShip: ");
        int crewCapacity = scanner.nextInt();
        System.out.println("Enter the status of the SpaceShip: ");
        String status = scanner.next();

        SpaceShip spaceShip = new SpaceShip(name, model, yearBuilt, crewCapacity, status);
        spaceShipService.createANewSpaceShip(spaceShip);
    }








    }


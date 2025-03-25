package org.keyin.spaceship;

public class SpaceShipService {

    // Inject in the DAO to use in the service
    private SpaceShipDAO spaceShipDAO = new SpaceShipDAO();

    public void createANewSpaceShip(SpaceShip spaceShip) {
        spaceShipDAO.createANewSpaceShip(spaceShip);
        System.out.println("SpaceShip created successfully :) ");
    }

    public SpaceShip getSpaceShipByName(String name) {
        return spaceShipDAO.getSpaceShipByName(name);
    }
}

package org.keyin.spaceship;

public class SpaceShip {

    private int id;
    private String name;
    private String model;
    private int yearBuilt;
    private int crewCapacity;
    private String status;

    public SpaceShip(int id, String name, String model, int yearBuilt, int crewCapacity, String status) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.yearBuilt = yearBuilt;
        this.crewCapacity = crewCapacity;
        this.status = status;
    }

    public SpaceShip(String name, String model, int yearBuilt, int crewCapacity, String status) {
        this.name = name;
        this.model = model;
        this.yearBuilt = yearBuilt;
        this.crewCapacity = crewCapacity;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", yearBuilt=" + yearBuilt +
                ", crewCapacity=" + crewCapacity +
                ", status='" + status + '\'' +
                '}';
    }
}

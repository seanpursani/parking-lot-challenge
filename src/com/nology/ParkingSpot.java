package com.nology;

public class ParkingSpot {
    private ParkingSpotType type;
    private Vehicle vehicle;

    public ParkingSpot(ParkingSpotType parkingType) {
        this.type = parkingType;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

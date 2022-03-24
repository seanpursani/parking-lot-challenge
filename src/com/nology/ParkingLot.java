package com.nology;


import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<CompactSpot> compactSpotsList = new ArrayList<>();
    List<RegularSpot> regularSpotsList = new ArrayList<>();
    List<BikeSpot> bikeSpotsList = new ArrayList<>();

    private int freeBikeSpots;
    private int freeCompactSpots;
    private int freeRegularSpots;

    public ParkingLot(int freeBikeSpots, int freeCompactSpots, int freeRegularSpots) {
        this.freeBikeSpots = freeBikeSpots;
        this.freeCompactSpots = freeCompactSpots;
        this.freeRegularSpots = freeRegularSpots;
    }

    public void parkVehicle(Vehicle vehicle) {
        System.out.println("Thanks for choosing to park with us!");
        if (vehicle.getVehicleType().equals(VehicleType.VAN)) {
            if (freeRegularSpots > 0) {
                parkYourRegularVehicle(vehicle);
            } else {
                System.out.println("All regular spots have been taken!");
            }
        } else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if (freeCompactSpots > 0) {
                parkYourCompactVehicle(vehicle);
            } else if (freeRegularSpots > 0) {
                parkYourRegularVehicle(vehicle);
            } else {
                System.out.println("All compact and regular spots have been taken!");
            }
        } else if (vehicle.getVehicleType().equals(VehicleType.MOTORBIKE)) {
            if (freeBikeSpots > 0) {
                parkYourBikeVehicle(vehicle);
            } else if (freeCompactSpots > 0) {
                parkYourCompactVehicle(vehicle);
            } else if (freeRegularSpots > 0) {
                parkYourRegularVehicle(vehicle);
            } else {
                System.out.println("All parking spots have been taken!");

            }
        }
    }

    public void parkYourRegularVehicle(Vehicle vehicle) {
        RegularSpot regularSpot = new RegularSpot(ParkingSpotType.REGULAR);
        regularSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(regularSpot);
        regularSpotsList.add(regularSpot);
        freeRegularSpots --;
        System.out.println("You have successfully parked!");
    }

    public void parkYourCompactVehicle(Vehicle vehicle) {
        CompactSpot compactSpot = new CompactSpot(ParkingSpotType.COMPACT);
        compactSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactSpot);
        compactSpotsList.add(compactSpot);
        freeCompactSpots--;
        System.out.println("You have successfully parked!");
    }

    public void parkYourBikeVehicle(Vehicle vehicle) {
        BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
        bikeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeSpot);
        bikeSpotsList.add(bikeSpot);
        freeBikeSpots--;
        System.out.println("You have successfully parked!");
    }

    public int getTotalFreeBikeSpots() {
        return freeBikeSpots;
    }

    public int getTotalFreeCompactSpots() {
        return freeCompactSpots;
    }

    public int getTotalFreeRegularSpots() {
        return freeRegularSpots;
    }
}

package com.nology;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(2, 2, 2);
        Vehicle van = new Vehicle(VehicleType.VAN);
        parkingLot.parkVehicle(van);
    }
}

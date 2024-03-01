package Polymorphism.Exercise.Vehicles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carData = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carData[1]),Double.parseDouble(carData[2]),Double.parseDouble(carData[3]));
        String[] truckData = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckData[1]),Double.parseDouble(truckData[2]),Double.parseDouble(truckData[3]));
        String[] bussData = scanner.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(bussData[1]),Double.parseDouble(bussData[2]),Double.parseDouble(bussData[3]));
        int nLine = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < nLine; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            try {
                if (tokens[0].equals("Drive")) {
                    double distance = Double.parseDouble(tokens[2]);
                    if (tokens[1].equals("Car")) {
                        System.out.println(car.drive(distance));
                    } else if (tokens[1].equals("Truck")) {
                        System.out.println(truck.drive(distance));
                    } else if (tokens[1].equals("Bus")) {
                        if (bus.isEmpty()) {
                            bus.setEmpty(false);
                            bus.setFuelConsumption(bus.getFuelConsumption() + 1.4);
                        }
                        System.out.println(bus.drive(distance));
                    }

                } else if (tokens[0].equals("Refuel")) {
                    double liters = Double.parseDouble(tokens[2]);
                    if (tokens[1].equals("Car")) {
                        car.refuel(liters);
                    } else if (tokens[1].equals("Truck")) {
                        truck.refuel(liters);
                    } else if (tokens[1].equals("Bus")) {
                        bus.refuel(liters);
                    }
                } else if (tokens[0].equals("DriveEmpty")) {
                    if (!bus.isEmpty()) {
                        bus.setEmpty(true);
                        bus.setFuelConsumption(bus.getFuelConsumption() - 1.4);
                    }
                    double distanceBuss = Double.parseDouble(tokens[2]);
                    System.out.println(bus.drive(distanceBuss));
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

    }
}

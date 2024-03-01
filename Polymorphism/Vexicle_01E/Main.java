package Polymorphism.Vexicle_01E;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carData = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carData[1]),Double.parseDouble(carData[2]));
        String[] truckData = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckData[1]),Double.parseDouble(truckData[2]));
        int nLine = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < nLine; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
           if (tokens[0].equals("Drive")) {
               double distance = Double.parseDouble(tokens[2]);
               if (tokens[1].equals("Car")) {
                   System.out.println(car.drive(distance));
               } else if (tokens[1].equals("Truck")) {
                   System.out.println(truck.drive(distance));
               }

           } else if (tokens[0].equals("Refuel")){
               double liters = Double.parseDouble(tokens[2]);
               if (tokens[1].equals("Car")) {
                    car.refuel(liters);
               } else if (tokens[1].equals("Truck")) {
                        truck.refuel(liters);
               }
           }
        }

        System.out.println(car);
        System.out.println(truck);

    }
}

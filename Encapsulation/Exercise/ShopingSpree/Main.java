package Encapsulation.Exercise.ShopingSpree;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people  = new LinkedHashMap<>();
        Map<String, Product> products  = new LinkedHashMap<>();


        Arrays.stream(scanner.nextLine().split(";"))
                .forEach(p -> {
                    String[] tokens = p.split("=");
                    Person person = new Person(tokens[0],Double.parseDouble(tokens[1]));
                    people.putIfAbsent(person.getName(), person);
                });
        Arrays.stream(scanner.nextLine().split(";"))
                .forEach(p -> {
                    String[] tokens = p.split("=");
                    Product product = new Product(tokens[0],Double.parseDouble(tokens[1]));
                    products.putIfAbsent(product.getName(),product);
                });


        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String name = input.split("\\s+")[0];
            String product = input.split("\\s+")[1];

            Person person = people.get(name);
            Product product1 = products.get(product);
            person.buyProduct(product1);

            input = scanner.nextLine();
        }
        people.values().forEach(p -> {
            if (p.getProducts().size() == 0) {
                System.out.printf("%s - Nothing bought.%n", p.getName());

            } else {
                System.out.printf("%s - ",p.getName());
                String productName = p.getProducts().stream()
                        .map(Product::getName)
                        .collect(Collectors.joining(", "));
                System.out.println(productName);
            }
        });
    }
}

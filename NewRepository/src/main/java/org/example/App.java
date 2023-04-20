package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Hurra!");

        String[] cities = new String[4];

        cities[0] = "Praga";
        cities[1] = "Kraków";
        cities[2] = "Londyn";
        cities[3] = "Rzym";

        for (Integer i = 0; i < cities.length; i++) {
            String city = cities[i];
            System.out.println((i + 1) + ". " + city);
        }

        for (Integer i = 3; i < cities.length; i--) {
            String city = cities[i];
            System.out.println((i + 1) + ". " + city);

        }
        for (Integer i = 0; i < cities.length; i++) {
            if(i % 2 == 0) {
                String city = cities[i];
                System.out.println((i + 1) + ". " + city);
            }


        }





    }
}




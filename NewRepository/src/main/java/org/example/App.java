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

        for (Integer i = city.length - 1; i >=0, i--) {
            String city = cities[i];
            System.out.println((i + 1) + ". " + city);

        }
        for (Integer i = 0; i < cities.length; i++) {
            if(i % 2 == 0) {
                String city = cities[i];
                System.out.println((i + 1) + ". " + city);
            }


        }

//zadanie 3 Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.

        float[] liczby = {3.0f, 5,5f, 10.1f, 15.7f};
        float suma = 0;
        float averege;

        for (Integer i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        for (Integer i=0; i<liczby.length; i++){
            averege = suma / liczby.length;
        }
        System.out.println("Suma = " + suma);


//zadanie 4 Stwórz tablicę imion (z powtórzeniami) i następnie policz, ile razy występuje w niej imię "Jan".

    }
}




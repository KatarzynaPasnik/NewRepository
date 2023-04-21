package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Hurra!");

        // Zadanie 1:
        //Stwórz nowe repozytorium na GitHub, dodaj do niego nowy projekt Java z archetypu Maven Quickstart i udostępnij to repozytorium swojej parze.
        //Zadanie 2:
        //Stwórz tablicę nazw europejskich miast i następnie wypisz je na następujące sposoby:
        //od początku do końca
        //od końca do początku
        //co drugie miasto

        String[] cities = new String[4];

        cities[0] = "Praga";
        cities[1] = "Kraków";
        cities[2] = "Londyn";
        cities[3] = "Rzym";

        for (Integer i = 0; i < cities.length; i++) {
            String city = cities[i];
            System.out.println((i + 1) + ". " + city);
        }

        for (Integer i = 3; i >= 0; i--) {
            String city = cities[i];
            System.out.println((i + 1) + ". " + city);

        }

        for (Integer i = 0; i < cities.length; i = i + 2) {
            String city = cities[i];
            System.out.println((i + 1) + ". " + city);
            }

        // Zadanie 3:
        //Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.

        Float[] number = new Float[] {0.5f, 1.5f, 2.5f};

        // number[0] = 0.5f;
        // number[1] = 1.5f;
        // number[2] = 2.5f;

        float sum = 0;
        for (int i = 0; i <number.length; i++) {
            sum = sum + number[i];

            // tu nie może byc System.out.println!!! - poza klamrą musi

        }
        System.out.println("The sum is " + sum);



        //Zadanie 4:
        //Stwórz tablicę imion (z powtórzeniami) i następnie policz, ile razy występuje w niej imię "Jan" (TU "ALA"!!!).

        String[] names1 = new String[] {"Asia", "Jan", "Ala", "Aneta", "Ala", "Jan"};


        String name = "Jan";
        Integer counter = 0;
        Integer lengthArray = names1.length;

         for (Integer i = 0; i < names1.length; i++ ) {
             System.out.println("Imię to: " + names1[i]);
             if (name == names1[i]) {
                 counter++;
                 System.out.println("Counter wynosi teraz: " + counter);
             }

         }
        System.out.println("ostateczny counter wynosi: " + counter);

//        Integer counterAsia = 0;
//        Integer counterAla = 0;
//        Integer counterAneta = 0;
//
//
//        for (Integer i = 0; i < name.length; i++) {
//            if (name [i] == "Asia") {
//                counterAsia++;
//            }
//            else if (name [i] == "Ala") {
//                counterAla++;
//            }
//            else {
//                counterAneta++;
//            }
//        }
//        System.out.println("Ala appears: " + counterAla);






        //Zadanie 5:
        //Stwórz tablicę imion (bez powtórzeń) i następnie podaj, na którym indexie znajduje się w niej imię "Jan".


        String[] names = new String[] {"Basia", "Kasia", "Zosia", "Jan"};

//        Integer counterBasia = 0;
//        Integer counterKasia = 0;
//        Integer counterZosia = 0;
//        Integer counterJan = 0;

        for (Integer i = 0; i < names.length; i++) {
            if(names[i] == "Jan") {
                System.out.println("Jan is on index " + i);
            }

        }

//zadanie 3 Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.

        float[] liczby = {3.0f, 5,5f, 10.1f, 15.7f};
        float suma = 0;
        float averege =0;

        for (Integer i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        for (Integer i=0; i<liczby.length; i++){
            averege = suma / liczby.length;
        }
        System.out.println("Suma = " + suma);


//zadanie 4 Stwórz tablicę imion (z powtórzeniami) i następnie policz, ile razy występuje w niej imię "Jan".


        //Zadanie 6:
        //Stwórz tablicę liczb całkowitych i następnie znajdź największy i najmniejszy element tej tablicy.

        Integer[] solidNumbers = new Integer[] {1, 2, 3, 4, 5};
        // Integer solidNumbers = 0; <- TAK NIE ,integer musi w tablicy u góry a nie STRING, bo pracujemy tu na liczbacj nie text
        Integer max = solidNumbers [0];
        Integer min = solidNumbers [0];

        for (Integer i = 0; i < solidNumbers.length; i++){

            if (solidNumbers [i] > max) {
                max = solidNumbers [i];

            }
            else if (solidNumbers [i] < min) {
                min = solidNumbers [i];


            }


// System.out println POZA KLAMRĄĄĄĄ!
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);


        }

    }





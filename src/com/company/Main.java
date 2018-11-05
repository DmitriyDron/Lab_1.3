package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Person example_1 = new Person("Dmytro", "Dron", "Vitalyevich",
                "Lomonosova st. ", "+38(067)-84-74-555",
                "Unlim internet access");
        Person example_2 = new Person("Bogdan", "Dron", "Vitalyevich",
                "Rybnaya st. 1/2", "",
                "He was born in Mykolaiv.");
        Person example_3 = new Person("Vitaliy", "Dron", "Nikolaevich",
                "Rybnaya st. 1/2", "+38(067)-51-25-553",
                "Unlim internet access");
        Person example_4 = new Person("Zhanna", "Dron", "Andreevna",
                "Rybnaya st. 1/2", "+38(097)-29-14-910",
                "Unlim internet access");


        Person[] array = new Person[]{example_1, example_2, example_3, example_4};
        Scanner in = new Scanner(System.in);
        System.out.print("Input the letter:\n");
        char letter = in.next().charAt(0);
        System.out.print("Persons which name starts at  letter ["+letter+"]:\n");

        printPerson(array, letter);

        System.out.print("\nPersons which have telephones:\n");
        checkTelephone(array);

    }
    public static String [] tArray = new String[]{"Name","Surname","Lastname","Adress","Telepone Number","AInfo"};

    public static void printPerson(Person[] array, char letter) {
        String sLetter = String.valueOf(letter);
   //  System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s","Name","Surname","Lastname","Adress","TNumber","AInfo");
        System.out.printf("%-8s%-8s%-12s%-16s%-20s%-5s\n","Name","Surname","Lastname","Adress","TNumber","AInfo");


        for(int i = 0; i < array.length; i++) {
            if (array[i].getName().startsWith(sLetter.toUpperCase()))
            {

                System.out.printf("%30s",array[i].toString());
            }

        }

    }

    public static void checkTelephone(Person[] array) {

        System.out.printf("%-8s%-8s%-12s%-16s%-20s%-5s\n","Name","Surname","Lastname","Adress","TNumber","AInfo");
        for (int i = 0; i < array.length; i++) {
            if (array[i].gettNumber().isEmpty()) {

            }
            else{

                System.out.printf("%16s\n",array[i].toString());
            }
        }
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package com.intellij1.flightmodel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        initiate();

    }

    private static void initiate() {
        Passenger[] passengers={
                new Passenger("Robin",1,180),
                new Passenger("Geeta",1,90),
                new Passenger("Raji",3,730),
                new Passenger("Yash",3,20),
                new Passenger("Azad",2,150),

        };
        Arrays.sort(passengers);//order members based on comparable

        System.out.println("Sorting the Passengers based on their member levels");
        for(Passenger p:passengers)
        System.out.println("Passenger Name: "+ p.getName());

        Flight Boeing =new Flight(150);

        Boeing.add1Passenger(new Passenger("Robin"));
        Boeing.add1Passenger(new Passenger("Geeta"));
        Boeing.add1Passenger(new Passenger("Raji"));
        Boeing.add1Passenger(new Passenger("Yash"));
        Boeing.add1Passenger(new Passenger("Azad"));
        System.out.println("\nPassengers who boarded flight are:");


        System.out.println(" ** Passenger order using Iterable implementation **");
        for(Passenger p : Boeing)
            System.out.println(p.getName());

        System.out.println("***************************");
        System.out.println();

        /*
         System.out.println();
        System.out.println(" ** Passenger order using the anonymous class' Iterable implementation **");
        for(Passenger p : Boeing.getOrderedPassengers())
            System.out.println(p.getName());
         */


    }


}
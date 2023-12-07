package com.intellij1.flightmodel;

import javax.imageio.spi.ImageReaderWriterSpi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Flight implements Comparable<Flight>,Iterable<Passenger> {
    private int passengers;
    private int seats=150;
    private int maxNumber;
    public Flight(int maxNumber)
    {
        this.maxNumber=maxNumber;
    }

    private ArrayList<Passenger>passengerList=new ArrayList<>();
    @Override

    public int compareTo(Flight f) {

        return 0;
    }



    public void add1Passenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }

    /*

    public Iterable<Passenger> getOrderedPassengers() {

        return new Iterable<Passenger>() {
            @Override
            public Iterator<Passenger>iterator()
            {
                Passenger[] passengers = new Passenger[passengerList.size()];
                passengerList.toArray(passengers);
                Arrays.sort(passengers);
                return Arrays.asList(passengers).iterator();
            }
        };
    }

     */
}

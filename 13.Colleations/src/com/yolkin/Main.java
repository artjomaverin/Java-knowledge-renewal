package com.yolkin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("Infected Mushroom", 8, 14);
        //theatre.getSeats();
        theatre.reserveSeat("D12");
        theatre.reserveSeat("B07");
        //printList(theatre.seats);
        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.seats);
        Collections.reverse(reverseSeats);
        printList(reverseSeats);
        printList(theatre.seats);


    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("================================================================================================================================");
    }
}

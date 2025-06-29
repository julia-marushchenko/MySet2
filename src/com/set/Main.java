package com.set;// Java program to demonstrate java set

import java.util.HashSet;
import java.util.Set;

// Main class
public class Main {

    // Main class to run java program
    public static void main(String[] args) {

        // Creating set
        Set<String> set = new HashSet<>();

        // Adding elements to set
        set.add("Cairo");
        set.add("Kyiv");
        set.add("Berlin");
        set.add("Amsterdam");
        set.add("Paris");

        // Printing set to the console
        System.out.println(set);

        // Removing Amsterdam from set
        set.remove("Amsterdam");

        // Printing set to the console
        System.out.println(set);

        // Clearing set
        set.clear();

        // Checking if set if empty
        System.out.println("Is ser empty: " + set.isEmpty());
    }
}
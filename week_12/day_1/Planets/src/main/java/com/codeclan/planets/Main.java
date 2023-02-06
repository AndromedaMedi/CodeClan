package com.codeclan.planets;

public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 908973);
        System.out.println(planet.getName() + " is " + planet.getSize() + " big.");
        System.out.println(planet.explode());
    }
};
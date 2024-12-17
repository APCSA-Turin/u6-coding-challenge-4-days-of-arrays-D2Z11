package com.example.project;

public class Test {
    public static void main(String[] args) {
        Day4.Reindeer reindeer = new Day4.Reindeer("Dasher", 100, 5, 2);

        // Simulate 5 seconds of running
        for (int i = 0; i < 5; i++) {
            reindeer.simulateSecond();
        }
        System.out.println(reindeer.getDistanceTraveled());

        // Simulate 2 seconds of resting
        for (int i = 0; i < 2; i++) {
            reindeer.simulateSecond();
        }
        System.out.println(reindeer.getDistanceTraveled());
    }
}

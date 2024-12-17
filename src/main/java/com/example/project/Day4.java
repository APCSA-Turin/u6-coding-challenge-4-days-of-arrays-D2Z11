package com.example.project;

public class Day4 {

    private static String[] reindeer_names = { "Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner",
            "Blitzen" };

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and
                                   // rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private boolean isResting = false;
        private int helper = 0;
        private int distance = 0;
        // public static int farthestDistance = 0;

        // Constructor
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
        }

        public int getDistanceTraveled() { // this method is required
            return distance * speed;
        }

        public void simulateSecond() { // this method is required but not tested
            helper++;
            // System.out.println(helper + " " + runDuration);
            if (!isResting && helper <= runDuration) {
                // System.out.println(1);
                distance++;
            }
            if (helper >= runDuration) {
                // System.out.println(2);
                helper = 0;
                isResting = true;
            }
            if (isResting && helper <= restDuration) {
                // System.out.println(3);
                restDuration++;
            }
            if (helper >= runDuration) {
                // System.out.println(4);
                helper = 0;
                isResting = false;
            }
        }

        public String getName() {
            return name;
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers) { // you will be tested on this method
        for (int i = 0; i < reindeers.length; i++) {
            for (int z = 0; z < time; z++) {
                reindeers[i].simulateSecond();
            }
        }
        String name = "";
        int max = 0;
        for (int i = 0; i < reindeers.length; i++) {
            for (int z = 0; z < time; z++) {
                if (reindeers[i].getDistanceTraveled() > max) {
                    max = reindeers[i].getDistanceTraveled();
                    name = reindeers[i].getName();
                }
            }
        }
        return name;
    }

    public static void main(String[] args) { // for testing purposed

    }

}

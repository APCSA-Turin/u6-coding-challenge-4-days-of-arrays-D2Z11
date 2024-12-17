package com.example.project;

import java.util.Scanner;

public class Day1 {
    private static String[] elf_names = { "Glitter", "Chocolate", "Tiny", "Snowflake", "Frosty" };

    public static String generateElfName(String firstName) {
        // System.out.println("Enter your first name:");
        // Scanner in = new Scanner(System.in);
        // String firstName = in.nextLine();
        if (firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        String rand = elf_names[(int) (Math.random() * elf_names.length)];
        return (rand + " " + firstName);
    }
}
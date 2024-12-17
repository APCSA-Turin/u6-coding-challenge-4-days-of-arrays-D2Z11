package com.example.project;

public class Day3 {
  private static String debug = " ";

  private static String[] pattern(int size, int space, int beginSpace) {
    String[] pattern = new String[size];
    int z = 0;
    for (int t = 0; t < beginSpace; t++) {
      pattern[z] = debug;
      // System.out.print(pattern[z]);
      z++;
    }
    for (int i = 0; i < 3; i++) {
      pattern[z] = "*";
      // System.out.print(pattern[z]);
      z++;
      if (i==2) {
        break;
      }
      for (int t = 0; t < space; t++) {
        pattern[z] = debug;
        // System.out.print(pattern[z]);
        z++;
      }
    }
    for (int t = 0; t < beginSpace; t++) {
      pattern[z] = debug;
      // System.out.print(pattern[z]);
      z++;
    }
    // System.out.println();
    return pattern;
  }

  private static String[] fullPattern(int size) {
    String[] pattern = new String[size];
    int z = 0;
    for (int i = 0; i < size; i++) {
      pattern[z] = "*";
      // System.out.print(pattern[z]);
      z++;
    }
    // System.out.println();
    return pattern;
  }

  // private static String[] pattern2(int size, int offset) {
  //   String[] pattern = new String[size];
  //   int z = 0;

  //   for (int t = 0; t < 1; t++) {
  //     pattern[z] = " ";
  //     z++;
  //   }
  //   for (int i = 0; i < 3; i++) {
  //     pattern[z] = "*";
  //     z++;
  //     for (int t = 0; t < offset; t++) {
  //       pattern[z] = " ";
  //       z++;
  //     }
  //   }

  //   // for (int t = 0; t < 1; t++) {
  //   //   pattern[z] = " ";
  //   //   z++;
  //   // }
  //   return pattern;
  // }

  // private static String[] pattern3(int size) {
  //   String[] pattern = new String[size];
  //   int z = 0;

  //   for (int i = 0; i < size; i++) {
  //     pattern[z] = "*";
  //     z++;
  //   }

  //   return pattern;
  // }

  public static String[][] generateSnowflake(int size) { // you will be tested on this method
    String[][] grid = new String[size][size];
    int space = (size - 2) / 2;
    int beginSpace = 0;
    int originalBeginSpace = (size - 2) / 2;
    boolean change = false;
    for (int i = 0; i < size; i++) {
      grid[i] = pattern(size, space, beginSpace);
      if (!change) {
        space--;
        beginSpace++;
      } else {
        space++;
        beginSpace--;
      }
      if (space < 0) {
        space = 0;
        beginSpace = originalBeginSpace;
        i++;
        grid[i] = fullPattern(size);
        change = true;
      }
    }
    return grid;
  }

  // Prints the snowflake will be useful if tests fail (you will not be tested on
  // this method)
  // https://stackoverflow.com/questions/19648240/the-best-way-to-print-a-java-2d-array
  public static void printSnowflake(String[][] array) {
    for (String[] x : array) {
      for (String y : x) {
        System.out.print(y);
      }
      System.out.println();
    }
  }

  // Test for the snowflake generation
  public static void main(String[] args) {
    String[][] test = generateSnowflake(7);
    String[][] check = {
        { "*", " ", " ", "*", " ", " ", "*" },
        { " ", "*", " ", "*", " ", "*", " " },
        { " ", " ", "*", "*", "*", " ", " " },
        { "*", "*", "*", "*", "*", "*", "*" },
        { " ", " ", "*", "*", "*", " ", " " },
        { " ", "*", " ", "*", " ", "*", " " },
        { "*", " ", " ", "*", " ", " ", "*" }
    };
    printSnowflake(test);
  }
}

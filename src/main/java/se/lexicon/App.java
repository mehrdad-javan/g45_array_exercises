package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    while (true) {
      printMenu();
      switch (getInputNumber()) {
        case 1:
          Exercise01.ex1();
          break;
        case 2:
          Exercise02.ex2();
          break;
        case 3:
          Exercise03.ex3();
          break;
        case 4:
          Exercise04.ex4();
          break;
        case 5:
          Exercise05.ex5();
          break;
        case 6:
          Exercise06.ex6();
          break;
        case 7:
          Exercise07.ex7();
          break;
        case 8:
          Exercise08.ex8();
          break;
        case 9:
          Exercise09.ex9();
          break;
        case 10:
          Exercise10.ex10();
          break;
        case 11:
          Exercise11.ex11();
          break;
        case 12:
          Exercise12.ex12();
          break;
        case 13:
          Exercise13.ex13();
          break;
        case 0:
          System.exit(0);
          break;
        default:
          System.out.println("\t\texercise number is not valid");
          break;
      }


    } // while


  } // main


  public static void printMenu() {
    System.out.println("##### Arrays Exercises #####");
    System.out.print("\tExercise number (1-13): ");
  }

  public static int getInputNumber() {
    Scanner scanner = new Scanner(System.in);
    int number = 0;
    try {
      number = scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("\t\tenter a valid number between 1-13");
    }

    return number;
  }


} // class

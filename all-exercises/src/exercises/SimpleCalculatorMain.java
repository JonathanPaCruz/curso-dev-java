/*
 * Ejercicio para re-factorizar el proyecto que suma 2 números y procede a
 * realizar una comparación para validar que número es mayor
 *
 * el antiguo proyecto se encuentra en
 * package inputKeyboard -> ScannerExample
 */

package exercises;

import java.util.Scanner;

public class SimpleCalculatorMain {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int option;
    boolean repeat;
    do {
      clearScreen();
      int first = getNumber(userInput, "Ingresa el 1er número:");
      int second = getNumber(userInput, "Ingresa el 2do número:");

      printMessage(first, second);
      compareNumbers(first, second);

      System.out.println("¿Deseas ingresar más datos?\n - [1] para sí.\n - [0] para salir.");
      option = userInput.nextInt();
      repeat = option == 1;

    } while (repeat);
    userInput.close();
  }

  public static void clearScreen() {
    for (int i = 0; i < 50; i++) {
      System.out.println();
    }
  }

  public static int getNumber(Scanner scanner, String message) {
    System.out.println(message);
    int number = scanner.nextInt();
    return number;
  }

  public static void compareNumbers(int first, int second) {
    boolean compare = first > second;
    if (compare) {
      System.out.println("El 1er número es mayor que el 2do.");
    } else if (first == second) {
      System.out.println("Los números son iguales.");
    } else {
      System.out.println("El 2do número es mayor que el 1ero.");
    }
  }

  public static void printMessage(int firstNumber, int secondNumber) {
    System.out.println("La suma de los números es: " + (firstNumber + secondNumber));
    System.out.println("La diferencia de los números es: " + (firstNumber - secondNumber));
  }

}

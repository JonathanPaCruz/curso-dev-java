package inputKeyboard;

import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Ingresa el 1er número entero!");
    int firstNumber = userInput.nextInt();

    System.out.println("Ingresa el 2do número entero!");
    int secondNumber = userInput.nextInt();

    int sum = firstNumber + secondNumber;
    int difference = firstNumber - secondNumber;
    boolean compare = firstNumber > secondNumber;

    System.out.println("La suma de los números es: " + sum);
    System.out.println("La diferencia de los números es: " + difference);

    if (compare) {
      System.out.println("El 1er número es mayor que el 2do.");
    } else if (firstNumber == secondNumber) {
      System.out.println("Los números son iguales.");
    } else {
      System.out.println("El 2do número es mayor que el 1er.");
    }

    System.out.println("fin del aplicativo");
    userInput.close();

  }
}

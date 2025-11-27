package inputKeyboard;

import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner textInput = new Scanner(System.in);
    System.out.println("Ingresa el 1er número entero!");
    int numberCompare1 = textInput.nextInt();

    System.out.println("Ingresa el 2do número entero!");
    int numberCompare2 = textInput.nextInt();

    System.out.println("La suma de los números es: " + (numberCompare1 + numberCompare2));
    System.out.println("La diferencia de los números es: " + (numberCompare1 - numberCompare2));
    if (numberCompare1 > numberCompare2){
      System.out.println("El 1er número es mayor que el 2do.");
    } else if (numberCompare1 == numberCompare2) {
      System.out.println("Los números son iguales.");
    }else {
      System.out.println("El 2do número es menor que el 1er.");
    }

  }
}

package exercises;

import java.util.Scanner;

/*
 * El ejercicio corresponde a lo siguiente:
 *
 * 1.- El usuario debe ingresar la edad y 3 calificaciones de un estudiante.
 * 2.- Calcular el promedio de las calificaciones.
 * 3.- Evaluar si el estudiante aprobó o no.
 *
 * Criterios a evaluar:
 * average >=6 para considerar que el estudiante aprobó.
 *
 */
public class FinalProject {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    //Declaración de variables
    int age;
    double firstScore, secondScore, thirdScore;
    double addition;
    double average = 6.0;
    int option;
    boolean repeat;


    //Mensajes en pantalla
    String welcome = "Bienvenido al sistema de registro de calificaciones!";
    String firstIndication = "Favor de ingresar la edad del estudiante: ";
    String secondIndication = "A continuación se le pedirá registrar las 3 calificaciones del estudiante: ";
    String ageMessage = "La edad del estudiante es: ";
    String approvedMessage = "Felicidades estás aprobado.";
    String failedMessage = "Lo siento estás reprobado.";
    String averageMessage = "Tu promedio es de: ";
    String optionMessage = "¿Deseas ingresar nuevos registros? \n - [1] para sí. \n - [0] para terminar ejecución.";

    //Código
    do {
      System.out.println(welcome);
      System.out.println(firstIndication);
      age = userInput.nextInt();
      System.out.println(ageMessage + age);
      System.out.println(secondIndication);
      System.out.println("Ingresa la 1er calificación:");
      firstScore = userInput.nextDouble();
      System.out.println("Ingresa la 2da calificación:");
      secondScore = userInput.nextDouble();
      System.out.println("Ingresa la 3er calificación:");
      thirdScore = userInput.nextDouble();

      addition = (firstScore + secondScore + thirdScore) / 3;
      System.out.println(averageMessage + addition);

      if (addition >= average) {
        System.out.println(approvedMessage);
      } else
        System.out.println(failedMessage);

      System.out.println(optionMessage);
      option = userInput.nextInt();
      repeat = option == 1;


    } while (repeat);

    System.out.println("fin del aplicativo");
    userInput.close();
  }
}

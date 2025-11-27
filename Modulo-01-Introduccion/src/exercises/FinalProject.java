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
    final String WELCOME = "Bienvenido al sistema de registro de calificaciones!";
    final String FIRST_INDICATION = "Favor de ingresar la edad del estudiante: ";
    final String SECOND_INDICATION = "A continuación se le pedirá registrar las 3 calificaciones del estudiante: ";
    final String AGE_MESSAGE = "La edad del estudiante es: ";
    final String APPROVED_MESSAGE = "Felicidades el alumno ha aprobado.";
    final String FAILED_MESSAGE = "Lo siento el alumno ha reprobado.";
    final String AVERAGE_MESSAGE = "El promedio es de: ";
    final String OPTION_MESSAGE = "¿Desea ingresar nuevos registros? \n - [1] para sí. \n - [0] para terminar ejecución.";

    //Código
    do {
      System.out.println(WELCOME);
      System.out.println(FIRST_INDICATION);
      age = userInput.nextInt();
      System.out.println(AGE_MESSAGE + age);
      System.out.println(SECOND_INDICATION);
      System.out.println("Ingrese la 1er calificación:");
      firstScore = userInput.nextDouble();
      System.out.println("Ingrese la 2da calificación:");
      secondScore = userInput.nextDouble();
      System.out.println("Ingrese la 3er calificación:");
      thirdScore = userInput.nextDouble();

      addition = (firstScore + secondScore + thirdScore) / 3;
      System.out.println(AVERAGE_MESSAGE + addition);

      if (addition >= average) {
        System.out.println(APPROVED_MESSAGE);
      } else
        System.out.println(FAILED_MESSAGE);

      System.out.println(OPTION_MESSAGE);
      option = userInput.nextInt();
      repeat = option == 1;


    } while (repeat);

    System.out.println("fin del aplicativo");
    userInput.close();
  }
}

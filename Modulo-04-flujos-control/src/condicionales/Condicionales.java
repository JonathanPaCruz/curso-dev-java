package condicionales;

public class Condicionales {
  public static void main(String[] args) {
    int edad = 18;
    double average = 6;
    if (edad >= 18) {
      System.out.println("Eres mayor de edad: " + edad);
    } else if (edad <= 0) {
      System.out.println("No es valido!");
    } else System.out.println("Eres menor de edad: " + edad);


    //Refactor
    boolean isAdult = edad >= 18;
    boolean hasPassingGrade = average >= 6;

    if (isAdult && hasPassingGrade) {
      System.out.println("Se cumplen todos los requisitos!");
    } else
      System.out.println("No se cumple con todos los requisitos!");

    if (isAdult) {
      System.out.println("Eres mayor de edad");
    } else
      System.out.println("Eres menor de edad");

    if (hasPassingGrade) {
      System.out.println("Felicidades, lograste pasar de grado!");
    } else
      System.out.println("Lamentablemente reprobaste!");

    int day = 3;
    String dayWeek;
    switch (day) {
      case 1:
        dayWeek = "Lunes";
        break;
      case 2:
        dayWeek = "Martes";
        break;
      case 3:
        dayWeek = "Miércoles";
        break;
      case 4:
        dayWeek = "Jueves";
        break;
      case 5:
        dayWeek = "Viernes";
        break;
      default:
        dayWeek = "Día incorrecto";
        break;
    }
    System.out.println("El día de la semana es: " + dayWeek);
  }
}

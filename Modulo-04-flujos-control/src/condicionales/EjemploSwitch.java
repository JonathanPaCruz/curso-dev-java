package condicionales;

public class EjemploSwitch {
  public static void main(String[] args) {
    int day = 5;
    String oneDay;

    switch (day) {
      case 1:
        oneDay = "Lunes";
        break;
      case 2:
        oneDay = "Martes";
        break;
      case 3:
        oneDay = "Miércoles";
        break;
      case 4:
        oneDay = "Jueves";
        break;
      case 5:
        oneDay = "Viernes";
        break;
      default:
        oneDay = "Día no valido!";
        break;
    }
    System.out.println("oneDay = " + oneDay);
  }
}

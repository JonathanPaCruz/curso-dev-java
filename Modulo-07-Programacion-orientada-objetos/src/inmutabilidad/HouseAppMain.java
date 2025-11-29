package inmutabilidad;

public class HouseAppMain {
  public static void main(String[] args) {
    House house = new House(2, 2, 3.0);
    System.out.println("house.getDoors() = " + house.getDoors());
  }
}

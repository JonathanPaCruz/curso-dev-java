package houseexample;

public class HouseMain {
  public static void main(String[] args) {
    House myHouse = new House();
    myHouse.setDoors(2);
    myHouse.setWindows(4);
    myHouse.setSize(20);

    House myOtherHouse = new House(20,4,2);

    System.out.println("La cantidad de puertas de la casa2, es de: " + myHouse.getSize());
    myHouse.openDoor();
    double area = myHouse.calculateArea();
    System.out.println("El area de la casa es: " + area);

  }
}

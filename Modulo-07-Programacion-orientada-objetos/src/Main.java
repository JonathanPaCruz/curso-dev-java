public class Main {
  public static void main(String[] args) {
/*    Vehicle vehicle = new Vehicle("toyota", "G502", 2021);
    vehicle.setYear(2001);

    System.out.println(vehicle.toString());

    Car car = new Car("volkswagen", "polo", 2026, 2);

    System.out.println(car);
    Motorcycle moto = new Motorcycle("suzuki", "gtr500", 2027, 1, 2);
    System.out.println(moto);*/

    Car car = new Car("test", "gt200", 2001, 4);
    Motorcycle motorcycle = new Motorcycle("suzuki", "gtr20", 2021, false, 2);

    car.start();
    motorcycle.start();

  }
}

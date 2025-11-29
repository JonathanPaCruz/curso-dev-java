public class Car extends Vehicle {
  private int doors;

  public Car(String brand, String model, int year, int doors) {
    super(brand, model, year);
    this.doors = doors;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  @Override
  public String toString() {
    return "Car{" +
            "doors=" + doors +
            '}' + super.toString();
  }
}

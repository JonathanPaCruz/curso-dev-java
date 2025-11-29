public class Car extends Vehicle {
  private int doors;

  public Car(String brand, String model, int year, int doors) {
    super(brand, model, year);
    this.doors = doors;
  }

  /*
   *
   * Ejemplo de polimorfismo.
   * Se redefine el comportamiento que ya se tenía por defecto
   *
   * sobre escritura
   *
   */
  @Override
  public void start() {
    System.out.println("El auto está encendido");
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

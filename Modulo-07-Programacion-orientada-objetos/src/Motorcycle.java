public class Motorcycle extends Vehicle {
  private int wheels;
  private boolean hasSidecar;

  public Motorcycle(String brand, String model, int year, boolean hasSidecar, int wheels) {
    super(brand, model, year);
    this.hasSidecar = hasSidecar;
    this.wheels = wheels;
  }

  @Override
  public void start() {
    System.out.println("La motocicleta está encendida!");
  }

  public void popWheelie() {
    System.out.println("Esta haciendo caballito.");
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public boolean getHasSidecar() {
    return hasSidecar;
  }

  public void setHasSidecar(boolean hasSidecar) {
    this.hasSidecar = hasSidecar;
  }

  @Override
  public String toString() {
    return "Motorcycle{" +
            "wheels=" + wheels +
            ", hasSidecar=" + hasSidecar +
            '}' + super.toString();
  }
}

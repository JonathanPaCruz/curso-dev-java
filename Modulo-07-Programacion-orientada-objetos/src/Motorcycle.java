public class Motorcycle extends Vehicle {
  private int wheels;
  private double hasSidecar;

  public Motorcycle(String brand, String model, int year, double hasSidecar, int wheels) {
    super(brand, model, year);
    this.hasSidecar = hasSidecar;
    this.wheels = wheels;
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

  public double getHasSidecar() {
    return hasSidecar;
  }

  public void setHasSidecar(double hasSidecar) {
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

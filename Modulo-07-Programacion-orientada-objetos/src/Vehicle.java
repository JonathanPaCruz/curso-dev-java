public class Vehicle {
  private int year;
  private String brand;
  private String model;

  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  public void start() {
    System.out.println("El vehiculo ha encendido.");
  }

  public void stop() {
    System.out.println("El vehiculo se ha apagado.");
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    int concurrentYear = java.time.Year.now().getValue();
    if (year < 1886 || year > concurrentYear + 2) {
      throw new IllegalArgumentException("Año inválido!");
    }
    this.year = year;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            '}';
  }
}

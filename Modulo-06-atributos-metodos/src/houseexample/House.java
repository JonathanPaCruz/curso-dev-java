package houseexample;

public class House {
  //Definiendo atributos de la clase
  private int windows;
  private int doors;
  private double size;


  /*
   * lo conveniente es que todos los metodos sean públicos y
   * los atributos sean privados
   */
  public House() {
  }

  public House(double size, int windows, int doors) {
    this.size = size;
    this.windows = windows;
    this.doors = doors;
  }

  public int getWindows() {
    return windows;
  }

  public void setWindows(int windows) {
    this.windows = windows;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  //Definiendo método
  //void no retorna ningún valor.
  public void openDoor() {
    System.out.println("La puerta esta abierta");
  }

  //para retornar un valor de tipo duble
  public double calculateArea() {
    return size * size;
  }
}

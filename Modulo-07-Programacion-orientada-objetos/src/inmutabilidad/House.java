/*
 *
 * Para crear una clase inmutable se debe agregar seguir lo siguiente:
 * 1.- Agregar final a la clase.
 * 2.- Todos los atributos privados y final.
 * 3.- Crear su constructor para eliminar el error de los atributos.
 * 4.- No proporcionar métodos setter para los atributos.
 * 5.- Solo métodos getter
 * 6.- Estas clases no pueden ser extendidas, heredadas ni superclase.
 *
 */

package inmutabilidad;

public final class House {
  //atributos
  private final int doors;
  private final int windows;
  private final double size;

  public House(int doors, int windows, double size) {
    this.doors = doors;
    this.windows = windows;
    this.size = size;
  }

  public int getDoors() {
    return doors;
  }

  public int getWindows() {
    return windows;
  }

  public double getSize() {
    return size;
  }
}

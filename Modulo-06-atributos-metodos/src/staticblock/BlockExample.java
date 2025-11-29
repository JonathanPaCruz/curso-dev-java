/*
 * El bloque estático es un bloque de código dentro de una clase
 * que se ejecuta una unica vez cuando la clase se carga en memoria
 * antes de que se cree cualquier objeto y antes de que se ejecute el main*
 */

package staticblock;

public class BlockExample {


  static void main(String[] args) {
    System.out.println("Hola mundo!");
  }
  static {
    System.out.println("Bloque a ejecutar...");
  }
}

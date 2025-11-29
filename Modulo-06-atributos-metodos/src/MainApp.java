public class MainApp {
  static void main(String[] args) {

    //Se debe llamar al método para hacer uso del mismo.
    MainApp mainApp = new MainApp();
    mainApp.sayHola();

    //Al volverlo estático no es necesario hacer el paso anterior.
    sayHello();
  }

  //Método instancia
  public void sayHola() {
    System.out.println("Hola");
  }

  /*
   *
   * Si lo volvemos estático ni siquiera es necesario hacer el llamado a la instancia.
   *
   */

  //Método estático.
  public static void sayHello() {
    System.out.println("Hola");
  }
}

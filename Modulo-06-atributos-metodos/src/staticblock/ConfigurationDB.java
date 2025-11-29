package staticblock;

public class ConfigurationDB {
  static final String URL;
  static final String USER;

  static {
    USER = "root";
    URL = "localhost:8080";
    System.out.println("Configuración cargada!");
  }

  static void main(String[] args) {
    System.out.println(USER);
    System.out.println(URL);
  }
}

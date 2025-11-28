package strings;

public class ExampleStrings {
  public static void main(String[] args) {
    String name = "Jonathan";
    String name2 = "Jonathan";

    System.out.println(name == name2);

    String name3 = new String("Jonathan");

    System.out.println(name3 == name);

    System.out.println("name3 = " + name3);
    System.out.println("El nombre es: " + name.toUpperCase());
  }
}

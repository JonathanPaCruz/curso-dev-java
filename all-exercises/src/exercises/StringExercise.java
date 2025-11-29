package exercises;

public class StringExercise {
  public static void main(String[] args) {

    //Método length().
    String welcome = "Hola, mundo!";
    System.out.println("Longitud de welcome es: " + welcome.length());//12

    //Método charAt(int index).
    System.out.println("El carácter en la pos [2] es: " + welcome.charAt(2));//l

    //Método substring(int beginIndex, int endIndex).
    System.out.println("Subcadena: " + welcome.substring(0, 5)); //Hola,

    //Métodos toLowerCase() y toUpperCase().
    System.out.println("Minúsculas: " + welcome.toLowerCase()); //hola, mundo!
    System.out.println("Mayúsculas: " + welcome.toUpperCase()); //HOLA, MUNDO!

    //Método equals(Objet obj).
    String text1 = "hola";
    String text2 = "Hola";
    System.out.println("¿Son iguales?: " + text1.equals(text2)); //false

    //Método equalsIgnoreCase(String str).
    System.out.println("¿Son iguales? (ignorando mayúsculas de minúsculas): " + text1.equalsIgnoreCase(text2)); //true

    //Método contains(CharSequence s).
    System.out.println("¿El mensaje de Hola, Mundo!, contiene Mundo?: " + welcome.contains("mundo")); //true

    //Método replace(char oldChar, char NewChar).
    System.out.println("Reemplazo: " + welcome.replace('o', '@')); //H@la, mund@!

    //Método trim().
    String textWithSpace = "   Hola, mundo!   ";
    System.out.println("Trimmed: " + textWithSpace.trim()); //Hola, mundo!

    //Método split(String regex).
    String csvText = "Uno,Dos,Tres,Cuatro,Cinco";
    String[] parts = csvText.split(",", 3);
    System.out.println("Dividido:");
    for (String part : parts) {
      System.out.println(part);
    }
    //Uno
    //Dos
    //Tres,Cuatro,Cinco
  }
}

package exercises;

public class StringExercise {
    public static void main(String[] args) {

        //Método length().
        String welcome = "Hola, Mundo!";
        System.out.println("Longitud de welcome es: " + welcome.length());//12
        //Método charAt(int index).
        System.out.println("El carácter en la pos [2] es: " + welcome.charAt(2));//l
        //Métodos toLowerCase() y toUpperCase().
        System.out.println("Minúsculas: " + welcome.toLowerCase()); //hola, mundo!
        System.out.println("Mayúsculas: " + welcome.toUpperCase()); //HOLA, MUNDO!

        //Método equals(Objet obj)
        String text1 = "hola";
        String text2 = "Hola";
        System.out.println("¿Son iguales?: " + text1.equals(text2)); //false

        //Método equalsIgnoreCase(String str)
        System.out.println("¿Son iguales? (ignorando mayúsculas de minúsculas): " + text1.equalsIgnoreCase(text2)); //true

    }
}

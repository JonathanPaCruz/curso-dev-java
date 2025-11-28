package strings;

public class PersonCall {
  public static void main(String[] args) {
    Person myPerson = new Person(20,"Jonathan", "Pacheco");

    System.out.println("La edad es: " + myPerson.getAge());
    System.out.println("El nombre es: " + myPerson.getName());
    System.out.println("El apellido es: " + myPerson.getLastName());
    System.out.println(myPerson.toString());

  }

}

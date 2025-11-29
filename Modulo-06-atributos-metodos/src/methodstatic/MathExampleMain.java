package methodstatic;

public class MathExampleMain {
  static void main(String[] args) {
    int result;
    int resultAdd = MathExample.addition(5, 5); //Método estático
    System.out.println("La suma es: " + resultAdd);
    int resultSub = MathExample.substraction(10, 5);
    System.out.println("La resta es: " + resultSub);
    int resultMulti = MathExample.multiplication(5, 10);
    System.out.println("La multiplicación es: " + resultMulti);
    double resultDiv = MathExample.division(10.0, 5.0);
    System.out.println("La división es: " + resultDiv);

    //Otra forma de presentar.
    MathExample mathExample = new MathExample(); //Creando una instancia.
    result = mathExample.addition(10, 5);
    System.out.println("El resultado de la suma es: " + result);
    result = mathExample.substraction(10, 5);
    System.out.println("El resultado de la resta es: " + result);
    result = mathExample.multiplication(10, 5);
    System.out.println("El resultado de la multiplicación es: " + result);
    double result2 = mathExample.division(10, 5);
    System.out.println("El resultado de la división es: " + result2);
  }
}

//DEPENDENCIA

package relations;

public class Person {
  public void calculateSum(Calculator calculator) {
    int result = calculator.addition(4, 6);
    System.out.println("El resultado es = " + result);
  }
}

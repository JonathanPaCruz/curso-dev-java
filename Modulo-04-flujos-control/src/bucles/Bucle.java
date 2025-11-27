package bucles;

public class Bucle {
  public static void main(String[] args) {

    //refactor del for
    final int MAX_COUNT = 20;
    for (int currentNumber = 0; currentNumber <= MAX_COUNT; currentNumber += 2) {
      System.out.println("currentNumber = " + currentNumber);
    }


    for (int i = 0; i <= 20; i += 2) {
      System.out.println(i);
    }


    int counter = 0;
    int acomulator = 0;
    while (counter < 5) {
      System.out.println(counter);
      counter++;
      acomulator = acomulator + counter;
    }
    System.out.println(acomulator);

    int counter2 = 0;
    do {
      System.out.println("Counter 2:" + counter2);
      System.out.println("=".repeat(12));
      counter2++;
    } while (counter2 <= 5);
  }
}


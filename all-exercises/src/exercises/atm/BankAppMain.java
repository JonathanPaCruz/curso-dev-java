/*
 *
 * Ejercicio:
 * Crear una cuenta de banco y dentro de esa cuenta de banco se podrá hacer lo siguiente:
 * - Depositar
 * - Retirar
 * - Mostrar el saldo de una cuenta
 *
 */
package exercises.atm;

public class BankAppMain {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("Jonathan", 1000);
    BankApp bankApp = new BankApp(bankAccount);
    bankApp.startApp();

  }
}

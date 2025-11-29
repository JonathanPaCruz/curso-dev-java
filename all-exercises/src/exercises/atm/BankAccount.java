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

public class BankAccount {
  private String accountHolder;
  private double balance;

  public BankAccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Se ha realizado un depósito exitoso por la cantidad: \n" + amount);
    } else {
      System.out.println("Error: El monto ingresado no es correcto.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Se ha realizado un retiro exitoso: \n" + amount);
    } else {
      System.out.println("Error: El monto ingresado no es correcto.\n o no cuentas con fondos suficientes.");
    }
  }

  public void displayBalance() {
    System.out.println("tu saldo es:" + balance);
  }
}

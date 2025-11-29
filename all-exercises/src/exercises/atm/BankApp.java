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

import java.util.Scanner;

public class BankApp {
  private BankAccount bankAccount;
  private Scanner userInput;

  public BankApp(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
    this.userInput = new Scanner(System.in);
  }

  public void startApp() {
    int option;
    do {
      displayMenu();
      option = getUserOption();
      processOption(option);
    } while (option != 0);
  }

  private void displayMenu() {
    System.out.println("\nSeleccionar opciones.");
    System.out.println("[1] - Dépositar dinero.");
    System.out.println("[2] - Retirar dinero.");
    System.out.println("[3] - Mostrar saldo.");
    System.out.println("=".repeat(20));
    System.out.println("[0] - Salir.");
  }

  private int getUserOption() {
    return userInput.nextInt();
  }

  private void handleDeposit() {
    System.out.println("Ingrese el monto a depositar:");
    double depositAmount = userInput.nextDouble();
    bankAccount.deposit(depositAmount);
  }

  private void handleWithdraw() {
    System.out.println("Ingrese el monto a retirar:");
    double withdrawAmount = userInput.nextDouble();
    bankAccount.withdraw(withdrawAmount);
  }

  private void processOption(int option) {
    switch (option) {
      case 1: {
        handleDeposit();
        break;
      }
      case 2:
        handleWithdraw();
        break;
      case 3:
        bankAccount.displayBalance();
        break;
      case 4:
        System.out.println("Gracias por utilizar la aplicación.");
        break;
      default:
        System.out.println("Por favor, ingresa una opción valida!");
        break;
    }
  }
}

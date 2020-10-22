package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
  /** . */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputPassword = new String();
    PasswordEncoder myEncoder = new PasswordEncoder();
    while (true) {
      System.out.println("Please enter a password: ");
      inputPassword = scanner.nextLine();
      if (inputPassword.equals("exit")) {
        break;
      }
      System.out.println(myEncoder.encode(inputPassword));
    }
    scanner.close();
  }

}

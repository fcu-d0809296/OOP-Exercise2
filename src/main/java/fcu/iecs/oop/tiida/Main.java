package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
  /** . */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    NissanTiida myNissan = new NissanTiida();
    int input;

    System.out.print("Please enter a number: ");
    input = scanner.nextInt();
    myNissan.tidda(input);
    scanner.close();
  }

}

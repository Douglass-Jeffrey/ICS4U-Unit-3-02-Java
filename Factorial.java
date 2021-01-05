/*
* This program uses recursion to find factorial of a number.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2021-01-05
* Class Factorial.
*/

// Import the Scanner class
import java.util.Scanner;

class Factorial {
  
  public static int factorialer(int someInt) {
    if (someInt == 1) {
      return 1;
    } else {
      return (someInt * factorialer(someInt - 1));
    }
  }

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {
    try {
      Scanner scanInt = new Scanner(System.in);

      // input
      System.out.println("Input an integer:");
      int userInt = scanInt.nextInt();
      
      // process
      int factorialNum = factorialer(userInt);

      //output
      System.out.println("Factorial " + userInt + " is: " + factorialNum);

    } catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}
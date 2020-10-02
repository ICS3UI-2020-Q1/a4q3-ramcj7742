import java.util.Scanner;
/**
 * Calculates sum of 1 to user num
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets user number
    System.out.println("Please enter an integer");
    int num = input.nextInt();

    //declare starting and accumulator variable
    int START = 0;
    int ACC = 0;

    //accumulator
    while(START < num){
      START = START + 1;
      ACC = ACC + START;
    }
    //Displays sum to user
    System.out.println("The sum of 1 to " + num + " is " + ACC);
    
  }
}

/*
* This program simulates the rolling of two die and 
* prints the outcome to the user.
*
* @author   Paul Brasfield
* @version  1.0
* @since    2020-10-02
*/

package DiceGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       //Prompt user for input 
       System.out.print("Type 'roll' to roll two die: ");
       Scanner in = new Scanner(System.in);
       
       //Check if the user input is "roll"
       if (in.nextLine().equals("roll")) {
           //Create two new dice of the Die class
           Die d1 = new Die();
           Die d2 = new Die();
           
           //Call the roll() method of both die
           d1.roll();
           d2.roll();
           
           //Create a line break
           System.out.println("");
           
           //Switch statement for first dice
           switch (d1.getSide()) {
                case 0:
                    System.out.println("Dice 1: 1");
                    break;
                case 1:
                    System.out.println("Dice 1: 2");
                    break;
                case 2:
                    System.out.println("Dice 1: 3");
                    break;
                case 3:
                    System.out.println("Dice 1: 4");
                    break;
                case 4:
                    System.out.println("Dice 1: 5");
                    break;
                case 5:
                    System.out.println("Dice 1: 6");
                    break;
                default:
                    System.out.println("Physics failed us. :(");
                    break;
           }
           
           //Switch statement for second dice
           switch (d2.getSide()) {
                case 0:
                    System.out.println("Dice 2: 1");
                    break;
                case 1:
                    System.out.println("Dice 2: 2");
                    break;
                case 2:
                    System.out.println("Dice 2: 3");
                    break;
                case 3:
                    System.out.println("Dice 2: 4");
                    break;
                case 4:
                    System.out.println("Dice 2: 5");
                    break;
                case 5:
                    System.out.println("Dice 2: 6");
                    break;
                default:
                    System.out.println("Physics failed us. :(");
                    break;
            }
        }
    } 
}

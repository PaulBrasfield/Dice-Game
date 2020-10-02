/*
* This program simulates the rolling of two six-sided dice and 
* prints the outcome to the user.
*
* @author   Paul Brasfield
* @version  1.0
* @since    2020-10-02
*/

package DiceGame;

import java.util.Random;

public class Die {
    
    //Variable to get the current side of the die
    private int side;
    
    //Empty constructor
    public Die() {
    }

    //Getter for the 'side' variable since
    //it is private
    public int getSide() {
        return side;
    }
    
    //Method to roll the die
    public int roll() {
        Random rand = new Random();
        this.side = rand.nextInt(5);
        return side;
    }
}

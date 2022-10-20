/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

 import java.util.Scanner;

class Scarecrow {

    /* Parts of the Scarecrow*/
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /* Scarecrow Constructor */
    public Scarecrow(Banner n, Pumpkin h, Shirt b, Pants l, Boot lf, Boot rf) {
        head = h;
        body = b;
        legs = l;
        leftFoot = lf;
        rightFoot = rf;
        sign = n;
    }

    /* Displays the Scarecrow */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {
        String message;
        //Scanner
        //Scanner input = new Scanner(System.in);
        //String message = input.nextLine();
        

        // TODO: Don't forget to update the line below if you modify the constructor
        

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        if (args.length > 0) {
            message = args[0];
        } else {
            message = "hello there";
        }
        
        Scarecrow myScarecrow = new Scarecrow(new Banner(message), new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"));
        
        myScarecrow.display();
        //input.close();
    }

}

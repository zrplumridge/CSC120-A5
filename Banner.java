/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Prints a decorative banner, resized to fit the message
     */
    public void display() {
        int i = this.message.length();

        //upper section of banner
        System.out.print(" ");
        for (int j = 0; j < i; j+= 2) {
            System.out.print("*~");
        }
        System.out.println("*~*~* ");

        //left and right sides; inline with message
        System.out.println("*~* " + this.message + " *~*");

        //bottom section of banner
        System.out.print(" ");
        for (int j = 0; j < i; j+= 2) {
            System.out.print("*~");
        }
        System.out.println("*~*~* ");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("supercalifragilisticexpialidocious");
        myBanner.display();
    }
}

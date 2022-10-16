/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

    /*
     * TODO: Modify this method to print ASCII Art Pants
     */
    public void display() {
        System.out.println("       /wwwwwwwwwwwww\\");
        System.out.println("      |wwwwwwwwwwwwwww|");
        System.out.println("     /wwwwwwwwwwwwwwwww\\");
        System.out.println("    |wwwwwwwwwwwwwwwwwww|");
        System.out.println("   /wwwwwwwwwwwwwwwwwwwww\\");
        System.out.println("  |wwwwwwwwwwwwwwwwwwwwwww|");
        System.out.println("          |  | |  |");
        System.out.println("          |  | |  |");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}

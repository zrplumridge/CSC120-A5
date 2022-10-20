/*
 * Shirt class 
 * Displays a sweater with a cable design
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + Zoe Plumridge (CSC 120 Fall'22)
 * @version 19 October 2022
 */
public class Shirt {

    public void display() {
        System.out.println("      ______|   |______");
        System.out.println("    / @  88 $\\_/$ 88  @ \\");
        System.out.println("   / @   88 $$$$$ 88   @ \\");
        System.out.println("  / @  /|88 $*$*$ 88|\\  @ \\");
        System.out.println(" / @  / |88 $$$$$ 88| \\  @ \\");
        System.out.println("/ @  /  |88 $*$*$ 88|  \\  @ \\");
        System.out.println("\\l|l/   |88 $*$*$ 88|   \\l|l/");
        System.out.println("        |88 $*$*$ 88| ");
        System.out.println("        |l|l|l|l|l|l|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}

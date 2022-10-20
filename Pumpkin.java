/*
 * Pumpkin class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + Zoe Plumridge CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pumpkin {
    
    /*
     * Prints ASCII art depicting a jack-o'-lantern to the console
     */
    public void display() {
        System.out.println("              ___");
        System.out.println("           ___)__|_");
        System.out.println("      .-*'          '*-,");
        System.out.println("     /      /|   |\\     \\ ");
        System.out.println("    ;      /_|   |_\\     ;");
        System.out.println("    ;   |\\           /|  ;");
        System.out.println("    ;   | ''--...--'' |  ;");
        System.out.println("     \\  ''---.....--''  /");
        System.out.println("     ''*-.,_______,.-*'  ");  
    }
    
    /* main method (for testing) */
    public static void main(String[] args) {
        Pumpkin myPumpkin = new Pumpkin();
        myPumpkin.display();
    }

}

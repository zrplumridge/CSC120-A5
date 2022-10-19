/*
 * Boot class
 * One-line boots for the scarecrow; boots can be displayed individually
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + Zoe Plumridge (CSC 120 Fall'22)
 * @version 19 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("        (____|");
        } else if (this.direction.equals("right")) {
          System.out.println(" |____)");
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}

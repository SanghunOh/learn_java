import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) throws InterruptedException {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        boolean t = true;
        String letter = null;
        int count = 0;
        while (t) {
            System.out.println("Enter Keyword");
            // Thread.sleep(2000);
            letter = myObj.nextLine(); // Read user input
            switch (letter) {
                case "P":
                    System.out.println("letter P ");
                    break;
                case "Q":
                    System.out.println("letter Q ");
                    break;
                default:
                    System.out.println("letter Default ");
                    break;
            }
            count++;
            System.out.println("Count: " + count); // Output user input
        }

        // int first = 0;
        // int second = 0;
        // first = myObj.nextInt();
        // second = myObj.nextInt();
        // System.out.println(first +", "+second);
        myObj.close();
        // // return 0;
    }
}

import java.util.Scanner;

public class ScannersWithArrays {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        // System.out.println("Enter username");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
        System.out.println(cars.length);
        for (int first=0;first < cars.length;first = first+1) {
            System.out.print(cars[first]+ ",");
            cars[first] = myObj.nextLine(); // Read user input
        }

        // String userName = myObj.nextLine(); // Read user input
        // System.out.println("Username is: " + userName); // Output user input

        // int first = 0;
        // int second = 0;
        // first = myObj.nextInt();
        // second = myObj.nextInt();
        // System.out.println(first +", "+second);
        System.out.println();
        // return 0;
    }
}

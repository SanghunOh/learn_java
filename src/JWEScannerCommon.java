// package jwe_JavaBasic;

import java.util.Scanner;

public class JWEScannerCommon {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("checkNumber: ");
                int checkNumber = scanner.nextInt();
                System.out.printf("description: ");
                String description = scanner.next();
                System.out.printf("amount: ");
                float amount = scanner.nextFloat();

                System.out.printf("/***** Common Text *****/\n\n");
                System.out.printf("checkNumber: %d\n", checkNumber);
                System.out.printf("description: %s\n", description);
                System.out.printf("amount: " + amount);
        }
}

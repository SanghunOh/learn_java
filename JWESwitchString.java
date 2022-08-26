package jwe_JavaBasic;

import java.util.Scanner;

public class JWESwitchString {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		char grade = scanner.next().charAt(0);
	     switch( grade ){
	        case 'A' : System.out.println( "Excellent\n" );
	                   break;
	        case 'B' : System.out.println( "Good\n" );
	                   break;
	        case 'C' : System.out.println( "OK\n" );
	                   break;
	        default  : System.out.println( "What is your grade anyway?\n" );
	                   break;
	     }
	}

}

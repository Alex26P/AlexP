package s03;

import java.util.Scanner;

public class NrPar {

	public static void main(String[] args) {

		/*
		 * Scanner nr = new Scanner(System.in); // the Scanner object syntax
		 * System.out.println("Insert number: ");
		 * 
		 * int number = nr.nextInt(); //it scans the next token of the input as an int
		 * 
		 * if (number % 2 == 0) { System.out.println("Even"); }
		 * 
		 * nr.close();
		 */

		Scanner nr = new Scanner(System.in);
		System.out.println("Insert number: ");

		int number = nr.nextInt();
		evennumber(number);

		nr.close();
	}

	// nu uita de acolade la if si de code conventions (evenNumber)
	public static void evennumber(int number) {
		if (number % 2 == 0)
			System.out.println("Even");

	}
}

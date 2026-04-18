package basic.language;

import java.util.Scanner;

public class InputNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Complete the function printNumber which takes an integer input
		 * from the user and prints it on the screen.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
		System.out.println("Input number: " + number);
	}

}

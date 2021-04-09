package Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			boolean keepGoing;
			
			do {
				keepGoing = false;
				System.out.print("Please input 2 numbers: ");
				double n1 = scan.nextDouble();
				double n2 = scan.nextDouble();
				System.out.println("Please enter an operation: (a/b/c/d)");
				System.out.println("a) Addition");
				System.out.println("b) Subtraction");
				System.out.println("c) Multiplication");
				System.out.println("d) Division");
				char op = scan.next().charAt(0);
				switch(op) {
				case 'a':
					System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
					break;
				case 'b':
					System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
					break;
				case 'c':
					System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
					break;
				case 'd':
					System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
					break;
				default:
					System.out.println("Input Error");
				}
				
				System.out.print("Would you like do try again? (y/n) ");
				char next = scan.next().charAt(0);
				if(next == 'y')
					keepGoing = true;
			} while(keepGoing);
	}
}

package Loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Language;
		
		do {
			System.out.println("what's your programming language?");
			System.out.println("Enter your language: ");
			Language = sc.nextLine();
		} while (!Language.equalsIgnoreCase("Java"));
		
		System.out.println("Great choice! java is awesome.");
		sc.close();
	}

}

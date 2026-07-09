package conditionStatement;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if (num > 5) {
			System.out.println("num is greater than 5");
		}
	}

}

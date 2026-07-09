package conditionStatement;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp: ");
		int temp = sc.nextInt();
		if (temp > 20) {
			System.out.println("its a warm");
		} else {
			System.out.println("its a chily");
		}
	}
}

//output
//Enter temp: 
//21
//its a warm

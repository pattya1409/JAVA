package ControlFlow;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		for(int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
	}
}

//output
//Enter a number: 
//10
//1 is odd
//2 is even
//3 is odd
//4 is even
//5 is odd
//6 is even
//7 is odd
//8 is even
//9 is odd
//10 is even

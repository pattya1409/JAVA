package userInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.nextLine();
		System.out.println(name);
		
		
		System.out.println("enter byte");
		byte a = sc.nextByte();
		System.out.println(a);
		System.out.println("enter short");
		short b = sc.nextShort();
		System.out.println(b);
		System.out.println("enter int");
		int c = sc.nextInt();
		System.out.println(c);
		System.out.println("enter long");
		long d = sc.nextLong();
		System.out.println(d);
		System.out.println("enter float");
		float e = sc.nextFloat();
		System.out.println(e);
		System.out.println("enter double");
		double f = sc.nextDouble();
		System.out.println(f);
		System.out.println("enter boolean");
		boolean g = sc.nextBoolean();
		System.out.println(g);
		System.out.println("enter char");
		char ch = sc.next().charAt(1);
		System.out.println(ch);
		
		

	}

}

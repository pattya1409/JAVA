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

//output
//enter name : 
//prathamesh ravindra patil
//prathamesh ravindra patil
//enter byte
//12
//12
//enter short
//130
//130
//enter int
//12000
//12000
//enter long
//1234567
//1234567
//enter float
//13.4
//13.4
//enter double
//234.7
//234.7
//enter boolean
//true
//true
//enter char
//prathamesh
//r

package conditionStatement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Lightcolor : ");
		char lightColor = sc.next().charAt(0);
		
		
	    performAction(lightColor);
	}
	
	static void performAction(char lightColor) {
		switch(lightColor) {
		case 'R' : System.out.println("stop");
		break;
		case 'Y' : System.out.println("wait");
		break;
		case 'G' : System.out.println("go");
		break;
		default : System.out.println("run");
		}
	}

}

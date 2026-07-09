package conditionStatement;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days: ");
		int studyDay = sc.nextInt();
		if(studyDay == 1) {
			System.out.println("its a java day");
		} else if (studyDay == 2) {
			System.out.println("its a python day");
		} else {
			System.out.println("not sure what day it is");
		}
	}
}

//output
//Enter days: 
//2
//its a python day

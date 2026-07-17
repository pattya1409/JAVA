package JumpStatement;

public class Break {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i==6) {
				System.out.println("item " + i + " found, stoping to search.");
				break;
			}
			System.out.println("checking item : " + i);
		}
	}

}

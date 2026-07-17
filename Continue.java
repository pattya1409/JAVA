package JumpStatement;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("Number " + i + " is skipped.");
				continue;
			}
			sum = sum + i;
			System.out.println("Number " + i + " is added. Current sum : " + sum);
		}
		System.out.println("Final sum: " + sum);
	}

}

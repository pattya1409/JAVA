package operators;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		boolean result = (x < 10) || (x > 15);
		System.out.println(result);
		boolean result1 = (x > 10) && (x > 15);
		System.out.println(result1);
		
		boolean result2 = (x > 10) != (x > 15);
		System.out.println(result2);
		
	}

}

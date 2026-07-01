package operators;

public class unary {
	public static void main(String[] args) {
	var a = 10;
	var b = ++a + a++ + --a + a++ + a-- + --a;
	System.out.println(a);
	System.out.println(b);
	}
}

//10
//66

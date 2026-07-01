package operators;

public class Bitwise {
	public static void main(String[] args) {
		var a = 5;
		var b = 3;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);
		System.out.println(a << 2);
		System.out.println(a >> 2);
	}
}


//output
//1
//7
//6
//-6
//20
//1

//Arithmetic operators are used to perform mathematical operations 
//such as addition, subtraction, multiplication, division, and finding the remainder.

//| Operator | Name                | Example  | Result |
//| -------- | ------------------- | -------- | ------ |
//| `+`      | Addition            | `10 + 5` | `15`   |
//| `-`      | Subtraction         | `10 - 5` | `5`    |
//| `*`      | Multiplication      | `10 * 5` | `50`   |
//| `/`      | Division            | `10 / 5` | `2`    |
//| `%`      | Modulus (Remainder) | `10 % 3` | `1`    |


package operators;

public class Arithmetic {
	public static void main(String[] args) {
		var a = 10;
		var b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}

//output 
//15
//5
//50
//2
//0

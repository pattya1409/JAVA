//Relational operators are used to compare two values or variables. 
//They always return a boolean value (true or false).

//| Operator | Name                     | Example    | Result  |
//| -------- | ------------------------ | ---------- | ------- |
//| `==`     | Equal to                 | `10 == 10` | `true`  |
//| `!=`     | Not equal to             | `10 != 5`  | `true`  |
//| `>`      | Greater than             | `10 > 5`   | `true`  |
////| `<`      | Less than                | `10 < 5`   | `false` |
//| `>=`     | Greater than or equal to | `10 >= 10` | `true`  |
//| `<=`     | Less than or equal to    | `10 <= 5`  | `false` |


package operators;

public class Relational {
	public static void main(String[] args) {
		System.out.println(10 < 20);
		System.out.println(10 > 5);
		System.out.println(10 <= 20);
		System.out.println(10 <= 10);
		System.out.println(10 >= 5);
		System.out.println(10 == 6);
		System.out.println(10 != 10);
	}
}

//output
//true
//true
//true
//true
//true
//false
//false

//Logical operators are used to combine or reverse boolean (true/false) expressions. 
//They are commonly used in decision-making statements like if, if-else, while, and for.

//| Operator | Name        | Description                                                      |
//| -------- | ----------- | ---------------------------------------------------------------- |
//| `&&`     | Logical AND | Returns `true` if **both** conditions are `true`.                |
//| `\|\|`   | Logical OR  | Returns `true` if **at least one** condition is `true`.          |
//| `!`      | Logical NOT | Reverses the boolean value (`true` → `false`, `false` → `true`). |

//Truth Table
//| A     | B     | A && B | A || B |   !A  |
//| ----- | ----- | :----: | :----: | :---: |
//| true  | true  |  true  |  true  | false |
//| true  | false |  false |  true  | false |
//| false | true  |  false |  true  |  true |
//| false | false |  false |  false |  true |


package operators;

public class Logical {
	public static void main(String[] args) {
		int x = 5;
		boolean result = (x < 10) || (x > 15);
		System.out.println(result);
		boolean result1 = (x > 10) && (x > 15);
		System.out.println(result1);
		boolean result2 = (x > 10) != (x > 15);
		System.out.println(result2);
	}
}

//output
//true
//false
//false




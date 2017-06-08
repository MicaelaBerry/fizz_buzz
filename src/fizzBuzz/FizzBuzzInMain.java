package fizzBuzz;

public class FizzBuzzInMain {

	public static void main(String[] args) { //this is a way to do FizzBuzz in one class

		int countUpTo = 20;

		for (int count = 1; count <= countUpTo; count++) { 
			// keeps counting after it loops a number up to 20; count++ makes it so it doesn't start at 0

			String say = "" + count; // default to count

			if (isFizz (count) && isBuzz(count)) { //this needs to be first so it checks it first and checks if true 
				say = "Fizz Buzz";					//and doesn't reassign it after you assign other IFs
			}
			else if (isFizz(count)) { //checks for the boolean statement below; less code
				say = "Fizz"; // redefined as "Fizz
			}
			else if (isBuzz(count)) {
				say = "Buzz";
			}
			System.out.println(say);
		}

	} //make it work, make it clean, make it fast

	public static boolean isFizz(int number){
	return number % 3 ==0;	
	}
	
	public static boolean isBuzz(int number){
	return number % 5 ==0;	
	}
}

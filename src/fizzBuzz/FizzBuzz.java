package fizzBuzz;

public class FizzBuzz { //this is using 2 classes (FizzBuzzInClass and FizzBuzz)

	int countUpTo;

	public FizzBuzz(int countUpTo) { // fizzbuzz instance
		this.countUpTo = countUpTo; }
	
	public void count() {
		for (int count = 1; count <= countUpTo; count++) {

			String say = "" + count; 

			if (isFizz(count) && isBuzz(count)) { 
				say = "Fizz Buzz"; 
			} else if (isFizz(count)) { 
										
				say = "Fizz"; 
			} else if (isBuzz(count)) {
				say = "Buzz";
			}
			System.out.println(say);
		}
	}

	public static boolean isFizz(int number) {
		return number % 3 == 0;
	}

	public static boolean isBuzz(int number) {
		return number % 5 == 0;
	}
}

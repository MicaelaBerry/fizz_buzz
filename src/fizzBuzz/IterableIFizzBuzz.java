package fizzBuzz;

import java.util.Iterator;

public class IterableIFizzBuzz implements Iterable<String>{

	public int countUpTo;
	
	public  IterableIFizzBuzz (int countUpTo){ //constructor
		this.countUpTo = countUpTo;
	}
	
	@Override
	public Iterator<String> iterator() {
		return new FizzBuzzIterator();
	}

	class FizzBuzzIterator implements Iterator<String>{

		@Override
		public boolean hasNext() {
			return false;
		}
		@Override
		public String next() {
			return null;
		}
		
	}
	
}

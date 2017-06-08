package oh_my;

import java.util.Iterator;

public class OhMyIterator implements Iterator<String>{

	String[] values = {"lions", "tigers", "bears"}; //{values inside array}
	int index = 0;
	
	@Override
	public boolean hasNext() {
		return  index < values.length; //check index number and sees if the values are greater than that
	}

	@Override
	public String next() {
		String nextValue = values[index]; //if we just write 'return nextValue;' it will only return lions
		index++;						// we have to create a String and add 'index++' so it keeps checking for values
		return nextValue;
	}

}

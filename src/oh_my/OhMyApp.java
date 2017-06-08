package oh_my;

public class OhMyApp {

	public static void main(String[] args) {
		OhMyIterator itr = new OhMyIterator();
		
		System.out.println("First elemnet is " + itr.next()); 
		//we are calling the next method in the other class and itr is the NEW we created above
		//so that is why we are writing itr.next
	
		System.out.println("Does it have another element?" + itr.hasNext());
		//checking the hasNext boolean method to see if we have another element 
		
		while(itr.hasNext()){
		System.out.println("Next value is " + itr.next());
		}
	}

}

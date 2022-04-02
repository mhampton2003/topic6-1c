package app;

public class Counter {
	//static counter that starts at zero
	static int count = 0;
	
	//increment the counter
	static synchronized void increment() { //thread safe way to access and modify the counter value
		count += 1;
	}
	
	//get the counter value
	/**
	 * get the counter value
	 * @return count The counter value
	 */
	static int getCount() {
		return count;
	}
	
	

}

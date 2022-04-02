package app;

/**
 * @author Maya
 */
public class CounterWorker {

	/**
	 * creates 1000 threads, starts them and increments counter
	 * @param args Takes any number of values
	 * @throws InterruptedException Exception thrown if a thread is interrupted
	 */
	public static void main(String[] args) throws InterruptedException {
		//print start message
		System.out.println("This is the initial value of the Counter " + Counter.getCount());
		
		//number of counters to create
		int numberCounters = 1000;
		
		//create 1000 counters that can each run in their own thread
		CounterThread[] counters = new CounterThread[numberCounters];
		for (int i = 0; i < 1000; ++i) {
			counters[i] = new CounterThread();
		}
		
		//start all 1000 counter threads
		for (int i = 0; i < 1000; ++i) {
			counters[i].start();
		}
		
		//wait for 1000 counter threads to finish
		for (int i = 0; i < 1000; ++i) {
			counters[i].join();
		}
		
		//print end message
		System.out.println("This is the end value of the counter " + Counter.getCount());
		
	}

}

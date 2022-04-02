package app;

import java.util.Random;

public class CounterThread extends Thread {
	/**
	 * sleeps the thread, increments counter and exits thread
	 */
	public void run() {
		//sleep this thread for a random amount, increment counter and exit thread
		try {
			Random rand = new Random();
			int sleeper = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
			Thread.sleep(sleeper);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		Counter.increment();
	}

}

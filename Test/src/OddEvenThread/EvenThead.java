package OddEvenThread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;

public class EvenThead implements Runnable{
	
	private int limit;
	
	private SharedPrint sharedPrint;
	Condition cond;
	
	
	public EvenThead(int limit, SharedPrint sharedPrint) {
		this.limit = limit;
		this.sharedPrint = sharedPrint;
	}

	@Override
	public void run() {
		cond.
		int even = 2;
		
		while(even <= limit) {
			sharedPrint.printEven(even);
			even = even + 2;
		}
		
	}
	

}

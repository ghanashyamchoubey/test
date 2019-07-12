package OddEvenThread;

public class OddThread implements Runnable{
	
	private int limit;
	
	private SharedPrint sharedPrint;

	public OddThread(int limit, SharedPrint sharedPrint) {
		super();
		this.limit = limit;
		this.sharedPrint = sharedPrint;
	}

	@Override
	public void run() {
			int odd = 1;
			
			while(odd <= limit) {
				sharedPrint.printOdd(odd);
				odd = odd + 2;
			}
		
	}
	
	

}

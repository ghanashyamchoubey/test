package OddEvenThread;

public class SharedPrint{
	
	private static boolean isOdd = false;
	
	public synchronized void printOdd(int odd) {
		
		while(isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" : "+ odd);
		isOdd = true;
		notify();
		
	}
	
	public synchronized void printEven(int even) {
		
		while(!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+ even);
		isOdd = false;
		notify();
	}

}

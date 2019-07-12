package OddEvenThread;

public class MainClass {

	public static void main(String[] args) {
		SharedPrint sharedPrint = new SharedPrint();
		Thread t1 = new Thread(new OddThread(20, sharedPrint));
		t1.setName("Odd-Thread");
		Thread t2 = new Thread(new EvenThead(20, sharedPrint));
		t2.setName("Even-Thread");
		
		t2.start();
		t1.start();

	}

}

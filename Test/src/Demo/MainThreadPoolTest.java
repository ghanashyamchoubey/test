package Demo;

public class MainThreadPoolTest {

	public static void main(String[] args) {
		Threadpool pool = new Threadpool(10);
		for(int i = 0; i < 15; i++) {
			Task task = new Task(i);
			pool.execute(task);
		}

	}

}

class Task implements Runnable{
	
	private int n;
	
	public Task(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println("running"+  n);
		
	}
	
}

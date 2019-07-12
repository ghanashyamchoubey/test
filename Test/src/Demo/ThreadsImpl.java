package Demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsImpl {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		Future<Object> callableResponse = ex.submit(new CallableTest());

		System.out.println(callableResponse.get());		
		ex.submit(new RunnableTest());
	}

}

class CallableTest implements Callable<Object> {

	@Override
	public Object call() throws InterruptedException {
		Thread.sleep(5000);
		return "Callable";
	}

}

class RunnableTest implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable");
	}

}

package Demo;

import java.util.concurrent.LinkedBlockingQueue;

public class Threadpool {

	private final int nThreads;

	private final LinkedBlockingQueue queue;

	private final PoolWorker[] worker;

	public Threadpool(int nThreads) {
		this.nThreads = nThreads;
		this.queue = new LinkedBlockingQueue();
		this.worker = new PoolWorker[nThreads];
	}

	public void execute(Runnable task) {
		synchronized (queue) {
			queue.add(task);
			queue.notify();
		}
	}

	private class PoolWorker extends Thread {

		Runnable task;

		public void run() {

			while (true) {
				synchronized (queue) {
					while (queue.isEmpty()) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					task = (Runnable) queue.poll();
				}
				try {
					task.run();
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
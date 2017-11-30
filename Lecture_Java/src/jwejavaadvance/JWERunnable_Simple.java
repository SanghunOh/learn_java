package jwejavaadvance;

class JWERunnableImple implements Runnable {
	int count = 0;
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + ", " + i + ", " + count++);
		}
	}
}

public class JWERunnable_Simple {
	public static void main(String args[]) throws InterruptedException {
		JWERunnableImple r = new JWERunnableImple();
		Thread thread1 = new Thread(r, "Thread-1");
		thread1.start();
		thread1.join();
		Thread thread2 = new Thread(r, "Thread-2");
		thread2.start();
	}
}

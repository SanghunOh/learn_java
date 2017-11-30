package jwejavaadvance;

class ShareValue{
	int count ;
	public synchronized void setCount(int count){
		this.count = this.count + count;
	}
	public synchronized int getCount(){
		return this.count;
	}
}

class JWERunnableImpl implements Runnable {
	private String threadName;
	ShareValue shareValue = new ShareValue(); 

	JWERunnableImpl(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				shareValue.setCount(i);
				System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i + ", ShareValue : " + shareValue.getCount());
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}
}

public class JWERunable {
	public static void main(String args[]) throws InterruptedException {
		JWERunnableImpl r = new JWERunnableImpl("RunnableDemo-1");
		Thread thread1 = new Thread(r, "Thread-1");
		thread1.start();
		Thread thread2 = new Thread(r, "Thread-2");
		thread2.start();
	}
}

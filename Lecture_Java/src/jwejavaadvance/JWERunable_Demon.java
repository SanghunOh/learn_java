package jwejavaadvance;

class JWERunnable implements Runnable {
	private String instanceName;
	int shareCount = 0 ;
	private boolean stop = false;

    public void setStop(boolean stop){
        this.stop = stop;
    }

	JWERunnable(String name) {
		instanceName = name;
		System.out.println("Creating " + instanceName);
	}

	@Override
	public void run() {
		try {
			while(!stop) {
				System.out.println("Thread: " + Thread.currentThread().getName() + ", ShareValue : " + shareCount++);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + instanceName + " interrupted.");
		}
		System.out.println("Thread " + instanceName + " exiting.");
	}
}

public class JWERunable_Demon {
	public static void main(String args[]) throws InterruptedException {
		JWERunnable r = new JWERunnable("RunnableDemo-1");
		Thread thread1 = new Thread(r, "Thread-1");
		thread1.start();
		Thread thread2 = new Thread(r, "Thread-2");
		thread2.start();
		
		Thread.sleep(400);
		r.setStop(true);
//		thread2.interrupt();
	}
}

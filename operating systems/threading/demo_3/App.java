package demo3;

// Anonymous way of starting the Threads

public class App {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for (int i=0; i<10; i++) {
					System.out.println("Thread 1 "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				for (int i=0; i<5; i++) {
					System.out.println("Thread 2 "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		});
		System.out.println("Main started.");
		
		t1.start();
		t2.start();
		System.out.println("Main ended.");
		
		t1.join();
		t2.join();
		
		
		
	}

}

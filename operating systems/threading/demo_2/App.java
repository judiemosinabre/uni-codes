package demo2;

// starting Thread - method 2

class Runner implements Runnable {
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Hello "+i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		
		t1.start();
		t2.start();
		
	}

}

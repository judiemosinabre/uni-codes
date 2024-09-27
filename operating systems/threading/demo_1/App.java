package demo1;
// starting the thread - first method

class Runner1 extends Thread {
	public static int myid = 50;
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println("Runner 1 : "+i+" Myid : "+myid);
			// myid = myid + 5;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class Runner2 extends Thread {
	public static int myid = 10;
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println("Runner 2 : "+i+" Myid : "+myid);
			// myid = myid + 100;
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
		
		System.out.println("Main program started..");
		
		Runner1 runner1 = new Runner1();
		runner1.start();
		
		Runner2 runner2 = new Runner2();
		runner2.start();
		
		System.out.println("Main program ended...");

	}

}

package demo4;

public class TestThread {
	   public static void main(String args[]) {

	      PrintDemo PD = new PrintDemo();

	      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
	      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );
	      ThreadDemo T3 = new ThreadDemo( "Thread - 3 ", PD );
	      ThreadDemo T4 = new ThreadDemo( "Thread - 4 ", PD );
	      
	      T1.start();
	      T2.start();
	      T3.start();
	      T4.start();

	      // wait for threads to end
	         try {
	         T1.join();
	         T2.join();
	         T3.join();
	         T4.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}
package demo4;

class PrintDemo {
	   public void printCount() {
	      try {
	    	 // Thread t = Thread.currentThread();
	         for(int i = 5; i > 0; i--) {
	            System.out.println(Thread.currentThread() +" Counter   ---   "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
	}

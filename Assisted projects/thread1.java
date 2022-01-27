package Assistedpro;

public class thread1 extends Thread{
	
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		thread1 mt = new  thread1();
	  		mt.start();
	 	}
	}



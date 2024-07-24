package session7;

public class MyThread extends Thread {
       public void run() {
    	   //resource
    	   System.out.println(Thread.currentThread().getName());
       }
       
       public static void main(String[] args) {
		MyThread t1 = new MyThread();//Born State
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		//Thread  Scheduler - part of JVM
	}
}

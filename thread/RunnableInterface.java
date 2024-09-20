package com.thread;

public class RunnableInterface implements Runnable{

	@Override
	public void run() 
	{
		System.out.println("Parent Interface is Runnable.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Created after 5 Sec...");
	}
	
	public static void main(String[] args) {
		RunnableInterface th = new RunnableInterface();
		// As we are implements Runnable interface, It does not have start() so, to start thread we have to call start() which is present in Thread Class.So we created Thread class object to call start().
		Thread t = new Thread(th);
		t.start();
		
		// Here ThreadClass extends Thread Class so, ThreadClass has every method that original Thread have.So, we do not need to create object of Thread class.
		ThreadClass t2 = new ThreadClass();
		t2.start();
	}

}

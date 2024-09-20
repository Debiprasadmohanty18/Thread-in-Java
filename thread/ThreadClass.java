package com.thread;

public class ThreadClass extends Thread{
	
	public void run() {
		System.out.println("Parent Class is Thread...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
		System.out.println("Thread Created After 2sec");
	}
}

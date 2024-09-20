package com.threadMethods;

import com.thread.ThreadClass;

public class ThreadMethods{
	public static void main(String[] args) {
		System.out.println("Let's Start... ");
		
		System.out.println("Tell me the name of current Thread object :- ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//To get the current thread name;		
		Thread t = Thread.currentThread();
		String tName = t.getName();
		System.out.println("Current Thread Name :- " + tName);
		
		System.out.println("Set a Custom Name :- ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// To set a custom to current Thread:- 
		t.setName("MainThread");
		System.out.println("Updated Current Thread name :- " + t.getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Current ID of Thread :- " + t.getId()); // To get Current thread id.
		
		//Running our custom thread.
		ThreadClass thread = new ThreadClass();
		thread.start();
	}
}

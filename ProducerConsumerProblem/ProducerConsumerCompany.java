package com.ProducerConsumerProblem;

public class ProducerConsumerCompany {
	int n;
	boolean b = false;
	synchronized public void producedItem(int n)
	{
		if(b)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Produced :- " + this.n);
		b = true;
		notify();
	}
	
	synchronized public int consumedItem()
	{
		if(!b)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed :- " + this.n);
		b = false;
		notify();
		return this.n;
	}
	
	
}

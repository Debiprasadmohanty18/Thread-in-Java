package com.ProducerConsumerProblem;

public class Consumer extends Thread{
	
	ProducerConsumerCompany obj;

	public Consumer(ProducerConsumerCompany obj) {
		this.obj = obj;
	}
	
	public void run()
	{
		while(true)
		{
			this.obj.consumedItem();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


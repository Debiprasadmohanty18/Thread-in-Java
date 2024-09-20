package com.ProducerConsumerProblem;

public class Producer extends Thread{
	
	ProducerConsumerCompany obj;

	public Producer(ProducerConsumerCompany obj) {
		this.obj = obj;
	}
	
	public void run()
	{
		int i = 1;
		while(true)
		{
			this.obj.producedItem(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			i++;
		}
	}
	
}

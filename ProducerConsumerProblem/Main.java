package com.ProducerConsumerProblem;

public class Main {
	public static void main(String[] args) {
		ProducerConsumerCompany pro = new ProducerConsumerCompany();
		Producer p = new Producer(pro);
		Consumer c = new Consumer(pro);
		p.start();
		c.start();
	}
}

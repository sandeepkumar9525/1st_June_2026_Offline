package com.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(30);
		pq.add(10);
		pq.add(20);
		pq.add(1);

		System.out.println("Largest Number :"+pq.poll());
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		
		pq1.add(4);
		pq1.add(17);
		pq1.add(2);
		pq1.add(1);
		System.out.println( pq1);
		
		
		

	}

}

package com.mixquestion;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExapmle {

	public static void main(String[] args) {
		// Standard: FIFO queue using LinkedList
		Queue<String> line = new LinkedList<String>();
		line.add("G");
		line.add("D");
		line.add("P");
		System.out.println("Queue : " + line.poll());
		System.out.println("Queue : " + line);
		
		// PriorityQueue :  Elements sorted Automatically (Lowest number out first)
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(34);
		pq.add(21);
		System.out.println("Priority Queue : " + pq.peek());
		System.out.println("Priority Queue : " + pq);
	}

}

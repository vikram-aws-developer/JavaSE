package com.javase.concepts;
import java.util.*;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
	PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); // i just created one priorityQueue that one is empty
	
	
	pQueue.add(5);
	pQueue.add(5);
	pQueue.add(3);
	pQueue.add(1);
		
	
	Iterator  iterator = pQueue.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	pQueue.offer(2);
	pQueue.offer(4);
	pQueue.offer(6);
	pQueue.offer(8);
	
	System.out.println();
		
	
}

}

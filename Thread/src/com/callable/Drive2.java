package com.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		return 20;
	}

}

class Task1 implements Callable<Integer> {

	@Override
	public Integer call(){
		
		return 20;
	}

}

public class Drive2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		
		ExecutorService es= Executors.newFixedThreadPool(1);
		
		Future<Integer> future = es.submit(new Task());	
		System.out.println("Result : " + future.get());
		
		
		
	}

}

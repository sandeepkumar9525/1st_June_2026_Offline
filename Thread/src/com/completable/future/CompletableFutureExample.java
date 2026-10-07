package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 20;

		}).thenApplyAsync((n) -> {
			System.out.println(Thread.currentThread().getName());
			return n * 10;
		}).thenApply((n) -> {
			System.out.println(Thread.currentThread().getName());
			return "The result is " + n * 5;
		});

		System.out.println(completableFuture.get());
	}

}

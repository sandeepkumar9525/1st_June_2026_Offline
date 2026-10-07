package com.completable.future;

import java.util.concurrent.CompletableFuture;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test.main() START...");
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			System.out.println("inside cf1 " + Thread.currentThread().getName());
			return 20;

		}).thenApplyAsync((n) -> {
			System.out.println("inside cf1 " + Thread.currentThread().getName());
			return n * 10;
		});

		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			System.out.println("inside cf2 " + Thread.currentThread().getName());
			return 30;

		}).thenApplyAsync((n) -> {
			System.out.println("inside cf2 " + Thread.currentThread().getName());
			return n * 10;
		});
		CompletableFuture<Integer> finalcf = cf2.thenCombineAsync(cf1, (a, b) -> a + b);
		System.out.println(finalcf.join());
		System.out.println("Test.main() END...");
	}

}

package com.practice.multipleinheritance;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        CompletableFuture<Void> exceptionally = CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(10000);
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                    return "Hello world";
                }, executorService).thenApplyAsync(String::toUpperCase)
                .thenAccept(result -> System.out.println("Result : " + result))
                .exceptionally(throwable -> {
                    System.err.println("Error : " + throwable.getMessage());
                    return null;
                });

        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Main thread completed");
        executorService.shutdown();
        exceptionally.join();
    }
}

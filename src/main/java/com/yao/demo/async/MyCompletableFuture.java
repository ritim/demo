package com.yao.demo.async;

import java.util.concurrent.*;

public class MyCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCompletableFuture myCompletableFuture = new MyCompletableFuture();
        myCompletableFuture.async();
    }

    public void async() throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        try {
            CompletableFuture<Void> runAsync = CompletableFuture.runAsync(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + ", runAsync");
            }, threadPool);
            CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
                System.out.println(Thread.currentThread() + ", supplyAsync");
                return "supplyAsync";
            }, threadPool);
            CompletableFuture<Void> resultCompletableFuture = CompletableFuture.allOf(runAsync, supplyAsync);
            resultCompletableFuture.join();

            System.out.println("Complete...");
        } finally {
            threadPool.shutdown();
        }
    }

    public void async2() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future =
                CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(1000);
                        System.out.println("hello");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        future.get();
        System.out.println("world");
    }
}

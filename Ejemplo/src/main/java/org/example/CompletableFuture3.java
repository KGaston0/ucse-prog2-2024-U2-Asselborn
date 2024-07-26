package org.example;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture3 {
    public int tareasAsinc(){
        Random random = new Random();
        Integer tmp;
        CompletableFuture<Integer> tarea1=CompletableFuture.supplyAsync(()->{
            int numero = random.nextInt(100,500);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return numero;
        });
        CompletableFuture<Integer> tarea2=CompletableFuture.supplyAsync(()->{
            int numero = random.nextInt(100,500);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return numero;
        }); CompletableFuture<Integer> tarea3=CompletableFuture.supplyAsync(()->{
            int numero = random.nextInt(100,500);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return numero;
        }); CompletableFuture<Integer> tarea4=CompletableFuture.supplyAsync(()->{
            int numero = random.nextInt(100,500);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return numero;
        });
        CompletableFuture<Void> todas = CompletableFuture.allOf(tarea1,tarea2,tarea3,tarea4);
        CompletableFuture<Integer> resultado= todas.thenApply(v->{
           try {
                int sum=tarea1.get()+tarea2.get()+tarea3.get()+tarea4.get();
                return sum;
           }catch (InterruptedException | ExecutionException e){
               e.printStackTrace();
               return 0;
           }
        });
        try {
            return resultado.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

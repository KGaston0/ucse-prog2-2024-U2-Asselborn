package org.example;

public class Main {
    public static void main(String[] args) {
        CompletableFuture3 prueba3 = new CompletableFuture3();
        CompletableFuture4 prueba4 = new CompletableFuture4();
        System.out.println(prueba3.tareasAsinc());
        System.out.println(prueba4.tareasAsinc());
    }
}
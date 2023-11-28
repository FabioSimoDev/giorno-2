package es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { countDown();}

    public static void countDown(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci un numero intero per il conto alla rovescia: ");
        int number = scanner.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
            if(i != 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("il conto alla rovescia è stato interrotto. tutto male va, chiamate i pompieri");
                    break;
                }
            }
        }

        scanner.close();
    }
}

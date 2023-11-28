package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n = scanner.nextInt();
        System.out.println(numberToStr(n));
    }

    public static String numberToStr(int n){
        if(!(n >= 0 && n <= 3)){
            throw new IllegalArgumentException("il numero deve essere compreso tra 0 e 3");
        }

        switch (n){
            case 0:
                return "zero";
            case 1:
                return "uno";
            case 2:
                return "due";
            case 3:
                return "tre";
            default:
                return "";
        }
    }
}

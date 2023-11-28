package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa, ti dirò se la sua lunghezza è pari o dispari: ");
        String str = scanner.nextLine();
        boolean resStr = stringaPariDispari(str);
        if(resStr) System.out.println("questa stringa è pari!");
        else System.out.println("questa stringa è dispari!");
        System.out.println("bene, ora inserisci un anno (ad esempio: 2024) e io ti dirò se è bisestile: ");
        int y = scanner.nextInt();
        boolean resYear = annoBisestile(y);
        if(resYear) System.out.println("mmhh.. il " + y + ", a me sembra un anno bisestile!");
        else System.out.println("direi di no, il " + y + " non mi sembra un anno bisestile.");
    }

    public static boolean stringaPariDispari(String str) {
        if (str.length() % 2 == 0) {
            return true;
        }

        return false;
    }

    public static boolean annoBisestile(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}



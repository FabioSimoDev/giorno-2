package es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        splitStr();
    }

    public static void splitStr(){
            Scanner scanner = new Scanner(System.in);
            String input;

            while (true) {
                System.out.print("Inserisci una stringa (o ':q' per uscire): ");
                input = scanner.nextLine();

                if (":q".equals(input)) {
                    System.out.println("chiusura");
                    break;
                }

                String[] characters = input.split("");
                String joinedString = String.join(",", characters);

                System.out.println(joinedString);
            }

            scanner.close();
        }
}

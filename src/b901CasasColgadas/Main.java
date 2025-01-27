package b901CasasColgadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidad = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < cantidad; i++) {
            String palabra = teclado.nextLine();
            palabra = palabra.toLowerCase();

            if (palabra.equals("colgadas")) System.out.println("Bien");
            else System.out.println("Mal");
        }
    }
}
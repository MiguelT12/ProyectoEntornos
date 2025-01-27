package b902Anillamiento;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            int capturasCampannaActual = teclado.nextInt();
            int totalAvesAnilladas = 0;

            for (int captura = 0; captura < capturasCampannaActual; captura++) {
                int avesCapturadas = teclado.nextInt();
                int avesConAnillo = teclado.nextInt();

                totalAvesAnilladas += (avesCapturadas - avesConAnillo);
            }

            System.out.println(totalAvesAnilladas);
        }
    }
}
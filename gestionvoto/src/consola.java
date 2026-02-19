package interaccion;

import java.util.Scanner;

public class consola {

    private Scanner scanner;

    public consola() {
        scanner = new Scanner(System.in);
    }

    public String leer(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}


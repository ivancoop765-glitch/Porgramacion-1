import datos.votante;
import interaccion.consola;
import util.Utilidades;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        consola consola = new consola();

        String nombre = consola.leer("Ingrese nombre: ");
        String apellido = consola.leer("Ingrese apellido: ");
        int identificacion = Integer.parseInt(
                consola.leer("Ingrese número de identificación: ")
        );
        String fechaStr = consola.leer("Ingrese fecha de nacimiento (yyyy-MM-dd): ");

        LocalDate fechaNacimiento = Utilidades.convertirStringDate(fechaStr);

        votante votante = new votante(nombre, apellido, identificacion, fechaNacimiento);

        int edad = votante.calcularEdad();

        consola.imprimir("Cédula: " + votante.getnIdentificacion());
        consola.imprimir("Nombre: " + votante.getNombre() + " " + votante.getApellido());
        consola.imprimir("Edad: " + edad);

        if (edad >= 18) {
            consola.imprimir("Puede votar ");
        } else {
            consola.imprimir("No puede votar ");
        }
    }
}

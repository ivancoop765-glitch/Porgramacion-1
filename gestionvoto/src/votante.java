package datos;

import java.time.LocalDate;
import java.time.Period;

public class votante {

    private String nombre;
    private String apellido;
    private int nIdentificacion;
    private LocalDate fechaNacimiento;

    public votante(String nombre, String apellido, int nIdentificacion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nIdentificacion = nIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getnIdentificacion() {
        return nIdentificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}

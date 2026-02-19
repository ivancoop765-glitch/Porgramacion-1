package util;

import java.time.LocalDate;

public class Utilidades {

    public static LocalDate convertirStringDate(String fecha) {
        return LocalDate.parse(fecha);

    }
}

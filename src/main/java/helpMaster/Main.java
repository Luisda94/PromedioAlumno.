package helpMaster;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("12345678-9", "Juan Pérez", Arrays.asList(5, 6, 7), null);
        Alumno alumno2 = new Alumno("98765432-1", "Ana Gómez", Arrays.asList(4, 5, 6), null);

        List<Alumno> listaAlumnos = Arrays.asList(alumno1, alumno2);
        Calculadorah calculadora = new Calculadorah(listaAlumnos);

        List<Alumno> alumnosConPromedio = calculadora.calcularPromedios();
        for (Alumno alumno : alumnosConPromedio) {
            System.out.println("Alumno: " + alumno.getNombre() + ", Promedio: " + alumno.getPromedio());
        }
    }
}
	

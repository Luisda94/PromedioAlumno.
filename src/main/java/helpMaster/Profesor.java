package helpMaster;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Profesor {
    private Icalculadora calculadora;
	/*
	 * La clase Profesor debe tener el atributo Calculadora que sea del tipo
	 * ICalculadora y debe implementar un método mostrarAlumnosConPromedios que no
	 * recibe argumentos ni retorna valores e imprime en pantalla la lista de
	 * alumnos con sus promedios calculados haciendo uso del método
	 * calcularPromedios proporcionado por Calculadora.
	 */
    
    
    public void mostrarAlumnosConPromedios() {
        List<Alumno> alumnosConPromedio = calculadora.calcularPromedios();
        for (Alumno alumno : alumnosConPromedio) {
            System.out.printf("Alumno: %s (%s), Promedio: %.2f\n",
                    alumno.getNombre(), alumno.getRut(), alumno.getPromedio());
        }
    }
    
    
    
    
    
}


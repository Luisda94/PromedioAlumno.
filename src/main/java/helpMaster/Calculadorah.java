package helpMaster;

import java.util.List;


import lombok.Data;



@Data
public class Calculadorah implements Icalculadora {

	private List<Alumno> alumnos;//Atributo exigido con el ejercio modulo 6
	
	
	//Implementacion de la interfeces Icalculadora
	@Override
	public List<Alumno> calcularPromedios() {
		

		/*
		 * Solicita crear un proyecto Maven que, a partir de una lista de alumnos con
		 * sus notas, calcule el promedio de notas de cada alumno, los ingrese a la
		 * lista y luego esta se imprima completa por pantalla. El proyecto debe tener
		 * la estructura de la imagen contigua.
		 */
		
        for (Alumno alumno : alumnos) {
            if (alumno.getNotas() != null && !alumno.getNotas().isEmpty()) {
                float promedio = (float) alumno.getNotas().stream().mapToInt(Integer::intValue).average().orElse(0);
                alumno.setPromedio(promedio);
            } else {
                alumno.setPromedio(0f); // Sin notas, promedio es 0
            }
        }
        return alumnos;
    }
	
}

package helpMaster;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Calculadora implements Icalculadora {
    private List<Alumno> alumnos;

    @Override
    public List<Alumno> calcularPromedios() {
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

package helpMaster;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data


public class Alumno {
private String rut, Nombre;
private List<Integer> notas;
private Float Promedio;

}

package unisabana.edu.co.SigaBack;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Curso {
    private String nombreAsigantura;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;
}

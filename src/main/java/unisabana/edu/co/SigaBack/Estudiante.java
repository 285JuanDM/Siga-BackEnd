package unisabana.edu.co.SigaBack;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Estudiante {
    private String nombre;
    private int id;
    private String facultad;
}

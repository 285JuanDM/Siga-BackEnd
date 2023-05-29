package unisabana.edu.co.SigaBack;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Profesor {
    private String nombre;
    private int id;
    private String facultad;
}

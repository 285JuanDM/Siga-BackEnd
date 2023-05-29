package unisabana.edu.co.SigaBack;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
public class Estudiante {

    @Max(10)
    @Min(3)
    private String nombre;
    @Max(10)
    @Min(3)
    private int id;
    @Max(10)
    @Min(3)
    private String facultad;
}

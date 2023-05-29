package unisabana.edu.co.SigaBack;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    @Getter
    @Setter
    @Min(3)
    @Max(10)
    private String nombre;

    @Getter
    @Setter
    @Min(3)
    @Max(10)
    private int id;

    @Getter
    @Setter
    @Min(3)
    @Max(10)
    private String facultad;

}

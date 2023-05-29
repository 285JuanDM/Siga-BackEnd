package unisabana.edu.co.SigaBack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;

@NoArgsConstructor
@AllArgsConstructor
public class Profesor {

    @Getter
    @Setter
    @Min(3)
    @Min(10)
    private String nombre;

    @Getter
    @Setter
    @Min(3)
    @Min(10)
    private int id;

    @Getter
    @Setter
    @Min(3)
    @Min(10)
    private String facultad;
}

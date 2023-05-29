package unisabana.edu.co.SigaBack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Getter
    @Setter
    @Min(3)
    @Max(10)
    private String nombreAsignatura;

    @Getter
    @Setter
    @Min(3)
    @Max(10)
    private String nombreEstudiante;

    @Getter
    @Setter
    @Min(3)
    @Max(10)
    private String nombreProfesor;

}

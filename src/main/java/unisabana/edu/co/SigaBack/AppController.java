package unisabana.edu.co.SigaBack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {

    Estudiante estudiante = new Estudiante();
    List<Estudiante> estudiantes;

    Profesor profesor;
    List<Profesor> profesores = new ArrayList<>();

    Curso curso = new Curso();
    List<Curso> cursos = new ArrayList<>();

    public AppController() {
        this.estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan David Moreno", 1, "ingenieria"));
        estudiantes.add(new Estudiante("Joao Diaz", 2, "ingenieria"));
        this.profesores = new ArrayList<>();
        profesores.add(new Profesor("Daniel Orlando", 4, "ingenieria"));
        profesores.add(new Profesor("Claudia Lopez", 3, "ingenieria"));
        this.cursos = new ArrayList<>();
        cursos.add(new Curso("PNT", "Juan David Moreno", "Daniel Orlando"));
        cursos.add(new Curso("PNT", "Juan David Moreno", "Claudia Lopez"));
    }

    @GetMapping("/estudiantes")
    public List<Estudiante> CrearNuevoEstudiante(){
        return estudiantes;
    }



    @PostMapping("/profesores")
    public String CrearNuevoProfesor(@RequestBody Profesor profesor){
        profesores.add(profesor);
        return "Profesor creado";
    }

    @PostMapping("/cursos")
    public String CrearNuevoCurso(@RequestBody Curso curso){
        cursos.add(curso);
        return "curso creado";
    }
}

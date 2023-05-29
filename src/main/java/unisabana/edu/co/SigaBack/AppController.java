package unisabana.edu.co.SigaBack;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {


    private List<Curso> cursos;
    private CursosDefinitivos cursosDefinitivos;

    public AppController(){

        cursos = new ArrayList<>();
        cursosDefinitivos = new CursosDefinitivos(new ArrayList<>());

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", 0001, "Facultad 1");
        Estudiante estudiante2 = new Estudiante("María", 0002, "Facultad 2");
        Estudiante estudiante3 = new Estudiante("Carlos", 0003, "Facultad 1");
        Estudiante estudiante4 = new Estudiante("Ana", 0004, "Facultad 2");

        // Crear profesores
        Profesor profesor1 = new Profesor("Pedro", 2001, "Facultad 1");
        Profesor profesor2 = new Profesor("Laura", 2002, "Facultad 2");
        Profesor profesor3 = new Profesor("Luis", 2003, "Facultad 1");
        Profesor profesor4 = new Profesor("Elena", 2004, "Facultad 2");

        // Crear cursos
        List<Estudiante> estudiantesCurso1 = new ArrayList<>();
        estudiantesCurso1.add(estudiante1);
        List<Profesor> profesoresCurso1 = new ArrayList<>();
        profesoresCurso1.add(profesor1);
        Curso curso1 = new Curso("Curso1", estudiantesCurso1, profesoresCurso1);

        List<Estudiante> estudiantesCurso2 = new ArrayList<>();
        estudiantesCurso2.add(estudiante2);
        List<Profesor> profesoresCurso2 = new ArrayList<>();
        profesoresCurso2.add(profesor2);
        Curso curso2 = new Curso("Curso2", estudiantesCurso2, profesoresCurso2);

        List<Estudiante> estudiantesCurso3 = new ArrayList<>();
        estudiantesCurso3.add(estudiante3);
        List<Profesor> profesoresCurso3 = new ArrayList<>();
        profesoresCurso3.add(profesor3);
        Curso curso3 = new Curso("Curso3", estudiantesCurso3, profesoresCurso3);

        List<Estudiante> estudiantesCurso4 = new ArrayList<>();
        estudiantesCurso4.add(estudiante4);
        List<Profesor> profesoresCurso4 = new ArrayList<>();
        profesoresCurso4.add(profesor4);
        Curso curso4 = new Curso("Curso4", estudiantesCurso4, profesoresCurso4);

        // Agregar cursos a la lista de cursos
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        // Agregar cursos a la lista de cursos definitivos
        cursosDefinitivos.getCursos().add(curso1);
        cursosDefinitivos.getCursos().add(curso2);
        cursosDefinitivos.getCursos().add(curso3);
        cursosDefinitivos.getCursos().add(curso4);
    }

    @GetMapping(path = "/cursosDefinitivo")
    public CursosDefinitivos getCursosDefinitivos() {
        return cursosDefinitivos;
    }

    @PostMapping(path = "/curso/agregar")
    public void agregarCurso(@RequestBody Curso curso) {
        cursos.add(curso);
    }

    @PostMapping(path = "/cursoDefinitivo/agregar")
    public void agregarCursoDefinitivo(@RequestBody Curso curso) {
        cursosDefinitivos.getCursos().add(curso);
    }

    @DeleteMapping(path = "/curso/eliminar")
    public void eliminarCurso(@RequestParam Curso curso) {
        cursos.remove(curso);
    }

    @DeleteMapping(path = "/cursoDefinitivo/eliminar")
    public void eliminarCursoDefinitivo(@RequestBody Curso curso) {
        cursosDefinitivos.getCursos().remove(curso);
    }
}


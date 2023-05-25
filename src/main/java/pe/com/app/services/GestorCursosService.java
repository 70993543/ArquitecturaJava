package pe.com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.app.models.Alumno;
import pe.com.app.models.Curso;
import pe.com.app.repository.AlumnoRepository;
import pe.com.app.repository.CursoRepository;

@Service
public class GestorCursosService {
    
    @Autowired
    AlumnoRepository repoAlumno;

    @Autowired
    CursoRepository repoCurso;

    public void insertarAlumno(Alumno alumno){
        repoAlumno.insertar(alumno);
    }
    public List<Alumno> buscarTodosAlumnos(){
        return repoAlumno.buscarTodos();
    }
    public List<Curso> buscarTodoCursos(){
        return repoCurso.buscarTodos();
    }
}

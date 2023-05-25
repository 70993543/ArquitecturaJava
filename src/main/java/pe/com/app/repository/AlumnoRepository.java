package pe.com.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.app.models.Alumno;

@Repository
public class AlumnoRepository {
    private static List<Alumno> alumnos = new ArrayList<Alumno>();
    static{
        alumnos.add(new Alumno("pedro", 20));
        alumnos.add(new Alumno("angel", 39));
        alumnos.add(new Alumno("ana", 59));
    }

    public List<Alumno> buscarTodos(){
        return alumnos;
    }

    public void insertar (Alumno alumno){
        alumnos.add(alumno);
    }
}


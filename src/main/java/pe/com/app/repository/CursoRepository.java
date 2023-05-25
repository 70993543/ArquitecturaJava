package pe.com.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.app.models.Curso;

@Repository
public class CursoRepository {
    
    private static List<Curso> cursos = new ArrayList<Curso>();
    static{
        cursos.add(new Curso("java", 20));
        cursos.add(new Curso("php", 30));
        cursos.add(new Curso("python", 250));
    } 

    public List<Curso> buscarTodos(){
        return cursos;
    }

}

package pe.com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.app.services.GestorCursosService;

@Controller
public class AlumnoController {
    
    @Autowired
    GestorCursosService servicio;

    @RequestMapping("/listaalumnos")
    public String listaAlumnos(Model modelo){
        modelo.addAttribute("listaralumnos", servicio.buscarTodosAlumnos());
        return "listaalumnos";
    }
}

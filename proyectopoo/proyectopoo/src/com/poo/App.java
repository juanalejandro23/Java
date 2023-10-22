package com.poo;

import java.util.ArrayList;
import java.util.List;

import com.poo.model.Estudiante;
import com.poo.model.Materia;
import com.poo.service.IEstudianteService;
import com.poo.service.impl.EstudianteServiceImpl;

public class App {

    public static void main(String[] args) throws Exception {

        IEstudianteService iEstudianteService = new EstudianteServiceImpl();
             
        Estudiante estudiante = new Estudiante(
            "Juan", "M", "2003-01-18",
            "CEDUK",
            "Ingenieria en sistemas",
            4,
            1004);

        List<Materia> materias = new ArrayList<Materia>();

        Materia matematicas = new Materia("Matematicas", 8.0);
        Materia espanol = new Materia("Español", 8.0);
        Materia ingles = new Materia("Inglés", 8.7);

        materias.add(matematicas);
        materias.add(espanol);
        materias.add(ingles);

        estudiante.setPromedio(iEstudianteService.promedioFinal(materias));

        System.out.println(estudiante);
    }  
    
}
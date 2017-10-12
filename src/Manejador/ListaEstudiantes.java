/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejador;

import Objeto.Estudiante;
import java.util.Scanner;

/**
 *
 * @author jake
 */
public class ListaEstudiantes {
    
    private Estudiante estudiante;
    private Estudiante[] listaEstudiantes;

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ListaEstudiantes(Estudiante estudiante, Estudiante[] listaEstudiantes) {
        this.estudiante = estudiante;
        this.listaEstudiantes = listaEstudiantes;
    }
    
    public ListaEstudiantes(int numero) {
        estudiante = new Estudiante();
        listaEstudiantes = new Estudiante[numero];        
    }
    
    public ListaEstudiantes() {
        estudiante = new Estudiante();
        listaEstudiantes = new Estudiante[2];        
    }
    
    public void agregarEstudiante() {
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i < listaEstudiantes.length; i++) {
            
            System.out.println("Ingrese la nota del primer parcial");
            estudiante.setPrimerParcial(scanner.nextInt());        
            System.out.println("Ingrese la nota del segunda parcial");
            estudiante.setSegundoParcial(scanner.nextInt());
            System.out.println("Ingrese la nota del examen final");
            estudiante.setExamenFinal(scanner.nextInt());
            System.out.println("Ingrese la zona total");
            estudiante.setZona(scanner.nextInt());   
            
            listaEstudiantes[i] = estudiante;            
        }                        
    }
    
    public void mostrarAlumnos() {
        
        for(Estudiante estudiante: listaEstudiantes) {
            System.out.println("Nota primer parcial: " + estudiante.getPrimerParcial());
            System.out.println("Nota segundo parcial: " + estudiante.getSegundoParcial());
            System.out.println("Nota examen final: " + estudiante.getExamenFinal());
            System.out.println("Nota zona total: " + estudiante.getZona());
        }        
    }
    
    
    
}

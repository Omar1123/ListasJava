/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejador;

import Objeto.Estudiante;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        for(int i =0; i < listaEstudiantes.length; i++) {
            listaEstudiantes[i] = new Estudiante();
        }
    }
    
    public ListaEstudiantes(int numero) {
        estudiante = new Estudiante();
        listaEstudiantes = new Estudiante[numero];   
        for(int i =0; i < listaEstudiantes.length; i++) {
            listaEstudiantes[i] = new Estudiante();
        }
    }
    
    public ListaEstudiantes() {
        estudiante = new Estudiante();
        listaEstudiantes = new Estudiante[3];  
        for(int i =0; i < listaEstudiantes.length; i++) {
            listaEstudiantes[i] = new Estudiante();
        }
    }
    
    public void agregarEstudiante() {
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i < listaEstudiantes.length; i++) {
            
            estudiante = new Estudiante();
            
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
            System.out.println("_______________________________________________________");
            System.out.println("Nota primer parcial: " + estudiante.getPrimerParcial());
            System.out.println("Nota segundo parcial: " + estudiante.getSegundoParcial());
            System.out.println("Nota examen final: " + estudiante.getExamenFinal());
            System.out.println("Nota zona total: " + estudiante.getZona());
            System.out.println("_______________________________________________________");
        }        
    }
    
    public int promedioAlumnos() {
        
        int promedio;
        promedio = 0;
        
        for(Estudiante estudiante: listaEstudiantes) {
            
            int notaFinal;
            notaFinal = 0;
            
            notaFinal = estudiante.getPrimerParcial() + estudiante.getSegundoParcial() + estudiante.getExamenFinal() + estudiante.getZona();
            promedio = promedio + notaFinal;            
            
        }
        
        promedio = promedio / listaEstudiantes.length;
        
        return promedio;
    }  
    
    public void ordenarPromedio() {
                
        System.out.println("Array ordenado por primer parcial");       
        
        Arrays.sort(listaEstudiantes, Comparator.comparing(Estudiante::getPrimerParcial));        
        //imprimeArrayPersonas(listaEstudiantes);                
        
        //ArrayList<Estudiante> infos = new ArrayList<Estudiante>();                
        //Collections.sort(infos, Comparator.comparingInt(Estudiante::getPrimerParcial).reversed());
        
        for(Estudiante estudiante: listaEstudiantes) {
            System.out.println("_______________________________________________________");
            System.out.println("Primer parcial: " + estudiante.getPrimerParcial());            
            System.out.println("_______________________________________________________");
        }
    }
    
    /*public void imprimeArrayPersonas(Estudiante[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i].getPrimerParcial());
        }
    }*/
}

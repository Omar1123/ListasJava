/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Manejador.ListaEstudiantes;

/**
 *
 * @author jake
 */
public class Menu {
    
    private ListaEstudiantes listaEstudiantes;
    
    public Menu() {
        listaEstudiantes = new ListaEstudiantes();
    }
    
    public void agregarEstudiante() {
        listaEstudiantes.agregarEstudiante();
    }
    
    public void mostrarEstudiantes() {
        listaEstudiantes.mostrarAlumnos();
    }
    
}

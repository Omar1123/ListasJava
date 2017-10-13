/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import Menu.Menu;

/**
 *
 * @author jake
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.agregarEstudiante();
        menu.mostrarEstudiantes();
        menu.promedioEstudiantes();
        menu.ordenarPromedioEstudiantes();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author jake
 */
public class Estudiante implements Comparable<Estudiante> {

    private int primerParcial;
    private int segundoParcial;
    private int examenFinal;
    private int zona;

    public int getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(int primerParcial) {
        this.primerParcial = primerParcial;
    }

    public int getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(int segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public int getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(int examenFinal) {
        this.examenFinal = examenFinal;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public Estudiante(int primerParcial, int segundoParcial, int examenFinal, int zona) {
        this.primerParcial = primerParcial;
        this.segundoParcial = segundoParcial;
        this.examenFinal = examenFinal;
        this.zona = zona;
    }
    
    public Estudiante() {
        this.primerParcial = 0;
        this.segundoParcial = 0;
        this.examenFinal = 0;
        this.zona = 0;
    }   

    @Override
    public int compareTo(Estudiante o) {
        
        if(primerParcial < o.primerParcial) {
            return -1;
        }
        
        if(primerParcial < o.primerParcial) {
            return 1;
        }
        
        return 0;                
    }
}

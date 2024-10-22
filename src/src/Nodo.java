/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Jose
 */
public class Nodo {
    Joya informacion;
    Nodo izq;
    Nodo der;

    public Nodo(Joya informacion) {
        this.informacion = informacion;
        izq = null;
        der = null;
    }

    public Joya getInformacion() {
        return informacion;
    }
    
    public void getInformacion(Joya informacion) {
        this.informacion = informacion;
    }
    
}

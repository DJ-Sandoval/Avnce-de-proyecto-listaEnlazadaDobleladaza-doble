/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Jose
 */
public class TdaListaDoble {
    private Nodo p; // Primer nodo
    private Nodo u; // ?ltimo nodo

    public TdaListaDoble() {
        p = null;
        u = null;
    }

    public boolean isListaVacia() {
        return p == null;
    }

    public void insertarPrincipio(Joya informacion) {
        Nodo n = new Nodo(informacion);
        if (isListaVacia()) {
            p = u = n;
        } else {
            n.der = p;
            p.izq = n;
            p = n;
        }
    }

    public void insertarFinal(Joya informacion) {
        Nodo n = new Nodo(informacion);
        if (isListaVacia()) {
            u = p = n;
        } else {
            u.der = n;
            n.izq = u;
            u = n;
        }
    }

    public void consultaGeneralPU() {
        Nodo t = p;
        while (t != null) {
            System.out.printf("\nClave: %d, DatoB: %s, DatoC: %.2f, DatoD: %b, DatoE: %c\n", 
                              t.informacion.getClave(), 
                              t.informacion.getMarca(), 
                              t.informacion.getTipo(),
                              t.informacion.getDisponibilidad(), 
                              t.informacion.getPrecio());
            t = t.der;
        }
    }

    public void consultaGeneralUP() {
        Nodo t = u; // Comenzamos desde el ?ltimo nodo
        while (t != null) {
            System.out.printf("\nClave: %d, DatoB: %s, DatoC: %.2f, DatoD: %b, DatoE: %c\n", 
                              t.informacion.getClave(), 
                              t.informacion.getMarca(), 
                              t.informacion.getTipo(),
                              t.informacion.getDisponibilidad(), 
                              t.informacion.getPrecio());
            t = t.izq;
        }
    }

    public Nodo busquedaNodoPU(int claveBuscada) {
        Nodo t = p;
        while (t != null) {
            if (t.informacion.getClave() == claveBuscada) {
                return t;
            }
            t = t.der;
        }
        return null;
    }

    public boolean busquedaBooleana(int claveBuscada) {
        Nodo t = p;
        while (t != null) {
            if (t.informacion.getClave() == claveBuscada) {
                return true;
            }
            t = t.der;
        }
        return false;
    }

    public void eliminar(Nodo t) {
        if (t == p && t == u) {
            p = u = null;
        } else if (t == p) {
            p = p.der;
            p.izq = null;
        } else if (t == u) {
            u = u.izq;
            u.der = null;
        } else {
            Nodo anterior = t.izq;
            Nodo posterior = t.der;
            anterior.der = posterior;
            posterior.izq = anterior;
        }
        t = null;
    }
}

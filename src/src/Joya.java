/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Santiago Albor
 */
public class Joya {
    int clave;
    String marca;
    String tipo;
    int disponibilidad;
    float precio;
    Joya enlace;

    
    public Joya() {
        
    }
    
    public Joya(int clave, String marca, String tipo, int disponibilidad, float precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.clave = clave;
        enlace = null;
    }
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Joya getEnlace() {
        return enlace;
    }

    public void setEnlace(Joya enlace) {
        this.enlace = enlace;
    }
    
}

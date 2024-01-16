/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejercicioherencia.models;

public class Dinosaurio {
    
    
    public static int idGlobal = -1;
    
    private int id,cantPatas;
    private String Nombre,Periodo;
    private boolean rugir;

    public Dinosaurio(int id, int cantPatas, String Nombre, String Periodo, boolean rugir) {
        this.id = idGlobal;
        idGlobal++;
        this.cantPatas = cantPatas;
        this.Nombre = Nombre;
        this.Periodo = Periodo;
        this.rugir = rugir;
    }
    
    
    public Dinosaurio() {
        this.id = idGlobal;
        idGlobal++;
        this.cantPatas = 0;
        this.Nombre = "";
        this.Periodo = "";
        this.rugir = false;
    }

    public int getId() {
        return idGlobal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public boolean isRugir() {
        return rugir;
    }

    public void setRugir(boolean rugir) {
        this.rugir = rugir;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" + "id=" + id + ", cantPatas=" + cantPatas + ", Nombre=" + Nombre + ", Periodo=" + Periodo + ", rugir=" + rugir + '}';
    }
    
    
    
    
    
}

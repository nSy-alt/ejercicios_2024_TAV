
package cl.duoc.ejercicio5.model;

import java.time.LocalDate;

public class DatosAviones {
    //atributos repetidos en variedad de clases 
    
    private int ID;
    private String nombre;
    private int horasVoladas;
    private LocalDate fechaUltimovuelo;

    public DatosAviones(int ID, String nombre, int horasVoladas, LocalDate fechaUltimovuelo) {
        this.ID = ID;
        this.nombre = nombre;
        this.horasVoladas = horasVoladas;
        this.fechaUltimovuelo = fechaUltimovuelo;
    }
    public DatosAviones() {
        this.ID = ID;
        this.nombre = nombre;
        this.horasVoladas = horasVoladas;
        this.fechaUltimovuelo = fechaUltimovuelo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasVoladas() {
        return horasVoladas;
    }

    public void setHorasVoladas(int horasVoladas) {
        this.horasVoladas = horasVoladas;
    }

    public LocalDate getFechaUltimovuelo() {
        return fechaUltimovuelo;
    }

    public void setFechaUltimovuelo(LocalDate fechaUltimovuelo) {
        this.fechaUltimovuelo = fechaUltimovuelo;
    }
    
    
    
    
}

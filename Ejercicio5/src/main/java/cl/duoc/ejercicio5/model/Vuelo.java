
package cl.duoc.ejercicio5.model;

import java.time.LocalDate;

public class Vuelo {
    private int ID;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private String piloto;

    public Vuelo(int ID, String origen, String destino, LocalDate fecha, String piloto) {
        this.ID = ID;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.piloto = piloto;
    }
    
    public Vuelo() {
        this.ID = ID;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.piloto = piloto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}


package cl.duoc.ejercicio5.model;

import java.time.LocalDate;



public class Pasaje {
    
    private static int idglobal = 20;
    
    private int ID;
    private String pasajero;
    private LocalDate fecha;
    private int codigoVuelo;
    private int valor;
    private TipoAviones aeronave;

    public Pasaje(int ID, String pasajero, LocalDate fecha, int codigoVuelo, int valor, TipoAviones aeronave) {
        this.ID = idglobal++;
        this.pasajero = pasajero;
        this.fecha = fecha;
        this.codigoVuelo = codigoVuelo;
        this.valor = valor;
        this.aeronave = aeronave;
    }

    
    public Pasaje() {
        this.ID = idglobal++;
        this.pasajero = "";
        this.fecha = LocalDate.now();
        this.codigoVuelo = 0;
        this.valor = 0;
        this.aeronave = TipoAviones.carguero;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(int codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TipoAviones getAeronave() {
        return aeronave;
    }

    public void setAeronave(TipoAviones aeronave) {
        this.aeronave = aeronave;
    }

    
    @Override
    
    public String toString(){
        String Pasaje ="**********"+"\n"
                + "id: "+ID + "\n" 
                +"Pasajero: "+pasajero + "\n" 
                +"fecha actual: "+fecha + "\n" 
                + "Codigo de Vuelo: " + "#"+codigoVuelo 
                + "\n" + "Tipo aeronave: " + aeronave.toString()
                +"\n"
                +"**********";
        return Pasaje;
    }

   
    
}


package cl.duoc.ejerciciotipoprueba.models;

public final class vehiculoPasajero extends vehiculo {
    
    private int cantidadPasajeros;

    public vehiculoPasajero(int cantidadPasajeros, String patente) {
        super(patente);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public vehiculoPasajero(int cantidadPasajeros) {
        super();
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
     public vehiculoPasajero() {
        super();
        this.cantidadPasajeros = 0;
    }
    
    
    
    
}

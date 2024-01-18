
package cl.duoc.ejerciciotipoprueba.models;

public final class vehiculoCarga extends vehiculo {
    
    private int capacidadCarga;

    public vehiculoCarga(int capacidadCarga, String patente) {
        super(patente);
        this.capacidadCarga = capacidadCarga;
    }

    public vehiculoCarga(int capacidadCarga) {
        super();
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "vehiculoCarga{" + "capacidadCarga=" + capacidadCarga + '}';
    }
    
    
    
    
    
}


package cl.duoc.ejerciciotipoprueba.models;

public abstract class  vehiculo {
    
    
    private String patente;

    public vehiculo(String patente) {
        this.patente = patente;
    }
    
    public vehiculo() {
        this.patente = "";
        
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "patente=" + patente + '}';
    }
    
    
    
    
}

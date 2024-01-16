
package cl.duoc.ejercicioherencia.models;

public class Velociraptor extends Dinosaurio{
    
    private long velocidadCorriendo;

    public Velociraptor(long velocidadCorriendo, int id, int cantPatas, String Nombre, String Periodo, boolean rugir) {
        super(id, cantPatas, Nombre, Periodo, rugir);
        this.velocidadCorriendo = velocidadCorriendo;
    }

    public Velociraptor(long velocidadCorriendo) {
        super();
        this.velocidadCorriendo = velocidadCorriendo;
    
    }
    
     public Velociraptor() {
        super();
        this.velocidadCorriendo = 0;
    
    }

    public long getVelocidadCorriendo() {
        return velocidadCorriendo;
    }

    public void setVelocidadCorriendo(long velocidadCorriendo) {
        this.velocidadCorriendo = velocidadCorriendo;
    }

    @Override
    public String toString() {
        return "Velocirraptor" + "\n"
                + "id: " + super.getId() + "\n"
                + "Nombre: " + super.getNombre() + "\n"
                + "Periodo: " + super.getPeriodo() + "\n"
                + "Velocidad Corriendo: " + velocidadCorriendo + "\n"
                + "Rugir:" + super.isRugir() + "\n"
                + "*****************************";
    }
     
    
    
    
}

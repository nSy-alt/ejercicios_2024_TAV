
package cl.duoc.ejercicioherencia.models;


public class Estegosaurio extends Dinosaurio{
    
    private int cantidadEspinas;

    public Estegosaurio(int cantidadEspinas, int id, int cantPatas, String Nombre, String Periodo, boolean rugir) {
        super(id, cantPatas, Nombre, Periodo, rugir);
        this.cantidadEspinas = cantidadEspinas;
    }

    public Estegosaurio(int cantidadEspinas) {
        super();
        this.cantidadEspinas = cantidadEspinas;
    }
    
    
    public Estegosaurio() {
        super();
        this.cantidadEspinas = 0;
    }

    public int getCantidadEspinas() {
        return cantidadEspinas;
    }

    public void setCantidadEspinas(int cantidadEspinas) {
        this.cantidadEspinas = cantidadEspinas;
    }

    @Override
    public String toString() {
        return "Estegosaurio" + "\n"
                + "id: " + super.getId() + "\n"
                + "Nombre: " + super.getNombre() + "\n"
                + "Periodo: " + super.getPeriodo() + "\n"
                + "Cantidad Espinas: " + cantidadEspinas + "\n"
                + "Rugir:" + super.isRugir() + "\n"
                + "*****************************";
    }
    
    
}

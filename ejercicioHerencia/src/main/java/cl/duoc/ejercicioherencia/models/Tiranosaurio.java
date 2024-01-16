package cl.duoc.ejercicioherencia.models;

public class Tiranosaurio extends Dinosaurio{
    
    private int cantidadColmillos;

    public Tiranosaurio(int cantidadColmillos, int id, int cantPatas, String Nombre, String Periodo, boolean rugir) {
        super(id, cantPatas, Nombre, Periodo, rugir);
        this.cantidadColmillos = cantidadColmillos;
    }

    public Tiranosaurio(int cantidadColmillos) {
        super();
        this.cantidadColmillos = cantidadColmillos;
    }

    public Tiranosaurio() {
        super();
        this.cantidadColmillos = 0;
    }

    public int getCantidadColmillos() {
        return cantidadColmillos;
    }

    public void setCantidadColmillos(int cantidadColmillos) {
        this.cantidadColmillos = cantidadColmillos;
    }

    @Override
    public String toString() {
        return "Tiranosaurio" + "\n"
                + "id: " + super.getId() + "\n"
                + "Nombre: " + super.getNombre() + "\n"
                + "Periodo: " + super.getPeriodo() + "\n"
                + "Cantidad Colmillos: " + cantidadColmillos + "\n"
                + "Rugir:" + super.isRugir() + "\n"
                + "*****************************";
    }
    
    
    
    
}

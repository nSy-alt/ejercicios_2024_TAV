
package cl.duoc.evaluacion1tav.models;

import cl.duoc.evaluacion1tav.ultils.AnimalFavorito;

public class Visitante {
    private int rut;
    private char dv;
    private long numeroCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private AnimalFavorito animalFavorito;
    private int edad;

    public Visitante(int rut, char dv, long numeroCliente, String nombreCliente, String apellidoCliente, AnimalFavorito animalFavorito, int edad) {
        this.rut = rut;
        this.dv = dv;
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.animalFavorito = animalFavorito;
        this.edad = edad;
    }

    public Visitante() {
        this.rut = 0;
        this.dv = 0;
        this.numeroCliente = 0;
        this.nombreCliente = "";
        this.apellidoCliente = "";
        this.animalFavorito = AnimalFavorito.otro;
        this.edad = 0;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public long getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(long numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public AnimalFavorito getAnimalFavorito() {
        return animalFavorito;
    }

    public void setAnimalFavorito(AnimalFavorito animalFavorito) {
        this.animalFavorito = animalFavorito;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return    """
                  **************VISITANTE***************
                  Nombre Visitante: """ + nombreCliente + " " + apellidoCliente + "\n"
                + "Rut Cliente: " + rut + "-" + dv + "\n"
                + "Numero Cliente: " + "+56 9 " + numeroCliente + "\n"
                + "Animal Favorito: " + animalFavorito + "\n"
                + "**************************************"
                ;
    
    
    }

  /*  private int rut;
    private char dv;
    private long numeroCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private AnimalFavorito animalFavorito;
    private int edad;
    
    */

}
    
   

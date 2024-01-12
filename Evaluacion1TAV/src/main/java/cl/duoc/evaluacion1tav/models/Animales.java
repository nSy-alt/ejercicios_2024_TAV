

package cl.duoc.evaluacion1tav.models;
import cl.duoc.evaluacion1tav.ultils.AmbienteAnimal;
import cl.duoc.evaluacion1tav.ultils.AnimalFavorito;


public class Animales {
   /* Y los atributos para los animals son:
• Numero de registro
• Nombre
• Tipo (Leon, cebra, jirafa u otro)
• edad
• Tipo de clima donde vive */
    
    public static int registroAnimal = -1;
    
    
    private int numeroRegistro;
    private String nombreAnimal;
    private AnimalFavorito tipoAnimal;
    private int edadAnimal;
    private AmbienteAnimal ambienteAnimal;

    public Animales(int numeroRegistro, String nombreAnimal, AnimalFavorito tipoAnimal, int edadAnimal, AmbienteAnimal ambienteAnimal) {
        this.numeroRegistro = registroAnimal;
        registroAnimal++;
        this.nombreAnimal = nombreAnimal;
        this.tipoAnimal = tipoAnimal;
        this.edadAnimal = edadAnimal;
        this.ambienteAnimal = ambienteAnimal;
    }
    
    
    public Animales() {
        this.numeroRegistro = registroAnimal;
        registroAnimal++;
        this.nombreAnimal ="";
        this.tipoAnimal = AnimalFavorito.otro;
        this.edadAnimal = 0;
        this.ambienteAnimal = ambienteAnimal.otro;
    }

    public static int getRegistroAnimal() {
        return registroAnimal;
    }

    public static void setRegistroAnimal(int registroAnimal) {
        Animales.registroAnimal = registroAnimal;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public AnimalFavorito getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(AnimalFavorito tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdadAnimal() {
        return edadAnimal;
    }

    public void setEdadAnimal(int edadAnimal) {
        this.edadAnimal = edadAnimal;
    }

    public AmbienteAnimal getAmbienteAnimal() {
        return ambienteAnimal;
    }

    public void setAmbienteAnimal(AmbienteAnimal ambienteAnimal) {
        this.ambienteAnimal = ambienteAnimal;
    }

    @Override
    public String toString() {
        
        return    """
                  ****************ANIMAL***************
                  Numero Registro: """ + registroAnimal + "\n" 
                + "Nombre Animal: " + nombreAnimal + "\n" 
                + "Tipo Animal: " + tipoAnimal + "\n"
                + "Edad animal: " + edadAnimal + " años" + "\n" 
                + "Ambiente animal: " + ambienteAnimal + "\n"
                + "*************************************";
    //    return "Animales{" + "numeroRegistro=" + numeroRegistro + ", nombreAnimal=" + nombreAnimal + ", tipoAnimal=" + tipoAnimal + ", edadAnimal=" + edadAnimal + ", ambienteAnimal=" + ambienteAnimal + '}';
    }
    
    
    
}

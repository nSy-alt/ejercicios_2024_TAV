
package cl.duoc.evaluacion1tav;

import cl.duoc.evaluacion1tav.models.Visitante;
import cl.duoc.evaluacion1tav.ultils.AnimalFavorito;
import cl.duoc.evaluacion1tav.models.Entrada;
import cl.duoc.evaluacion1tav.ultils.TipoEntrada;
import cl.duoc.evaluacion1tav.models.Animales;
import cl.duoc.evaluacion1tav.ultils.AmbienteAnimal;
import cl.duoc.evaluacion1tav.ultils.Validacion;

import java.time.LocalDate;
import java.time.Month;



public class Evaluacion1TAV {

    public static void main(String[] args) {
        
        //VISITANTE
        Visitante visitante1 = new Visitante();
        
        visitante1.setNombreCliente("Marcos");
        visitante1.setApellidoCliente("Terreros");
        visitante1.setRut(122049787);
        visitante1.setDv('6');
        visitante1.setEdad(20);
        visitante1.setNumeroCliente(57622503);
        visitante1.setAnimalFavorito(AnimalFavorito.Jirafa);
        
        System.out.println(visitante1);
       
        //ENTRADA
        
        Entrada entrada1 = new Entrada();
        
        entrada1.setFechaEntrada(LocalDate.of(2023, Month.MARCH, 20));
        entrada1.setTipoEntrada(TipoEntrada.normal);
        entrada1.setVisitante(visitante1);
        
        System.out.println(entrada1);
        
        //ANIMAL
        
        Animales animal1 = new Animales();
        
        animal1.setNombreAnimal("Think");
        animal1.setAmbienteAnimal(AmbienteAnimal.Savahna);
        animal1.setTipoAnimal(AnimalFavorito.Leon);
        animal1.setEdadAnimal(10);
        
        System.out.println(animal1);
        
        
        //Validacion
        
        System.out.println(Validacion.ValidaFecha(LocalDate.now()));
        
        
        
        
        
    }
}

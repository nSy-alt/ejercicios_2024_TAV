package cl.duoc.ejercicio5;
import cl.duoc.ejercicio5.model.Pasaje;
import cl.duoc.ejercicio5.model.TipoAviones;
import java.time.LocalDate;


public class Ejercicio5 {

    public static void main(String[] args) {
        
        
        Pasaje pasaje1 = new Pasaje();
        //pasaje1.setID(10);
        pasaje1.setPasajero("marco");
        pasaje1.setFecha(LocalDate.now());
        pasaje1.setCodigoVuelo(100);
        pasaje1.setValor(1000);
        pasaje1.setAeronave(TipoAviones.avion);
        
        Pasaje pasaje2 = new Pasaje();
        //pasaje1.setID(10);
        pasaje2.setPasajero("marco");
        pasaje2.setFecha(LocalDate.now());
        pasaje2.setCodigoVuelo(100);
        pasaje2.setValor(1000);
        pasaje2.setAeronave(TipoAviones.avion);
        
        System.out.println(pasaje1);
        
        System.out.println(pasaje2);
    }
}
    



package cl.duoc.ejercicioherencia;



import cl.duoc.ejercicioherencia.models.Dinosaurio;
import cl.duoc.ejercicioherencia.models.Estegosaurio;
import cl.duoc.ejercicioherencia.models.Tiranosaurio;
import cl.duoc.ejercicioherencia.models.Velociraptor;

public class EjercicioHerencia {

    public static void main(String[] args) {
        
        
        //Tiranosaurio
        Tiranosaurio nuevoDino = new Tiranosaurio();
        nuevoDino.setNombre("Pepito");
        nuevoDino.setPeriodo("Cretacico");
        nuevoDino.setCantidadColmillos(120);
        nuevoDino.setRugir(true);
        
        System.out.println(nuevoDino);
        
        
        //velocirraptor
        Velociraptor nuevoDino2 = new Velociraptor();
        nuevoDino2.setNombre("Paco");
        nuevoDino2.setPeriodo("Cretacico");
        nuevoDino2.setVelocidadCorriendo(80);
        nuevoDino2.setRugir(true);
        
        System.out.println(nuevoDino2);
    
        //Estegosaurio
        Estegosaurio nuevoDino3 = new Estegosaurio();
        nuevoDino3.setNombre("Pato");
        nuevoDino3.setPeriodo("Cretacico");
        nuevoDino3.setCantidadEspinas(50);
        nuevoDino3.setRugir(true);
        
        System.out.println(nuevoDino3);
    
    }
}

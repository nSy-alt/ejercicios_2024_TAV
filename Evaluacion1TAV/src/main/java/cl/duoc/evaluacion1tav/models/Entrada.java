package cl.duoc.evaluacion1tav.models;

import cl.duoc.evaluacion1tav.ultils.TipoEntrada;
import java.time.LocalDate;





public class Entrada {
    
    public static int idGlobal = -1;
    
    private int idEntrada;
    private Visitante visitante;
    private TipoEntrada tipoEntrada;
    private LocalDate fechaEntrada;
    private float valorEntrada;
    private boolean incluyeColacion; //la entrada indidca si lleva colacion "SI o NO"
    private float total;

    public Entrada(int idEntrada, Visitante visitante, TipoEntrada tipoEntrada, LocalDate fechaEntrada, float valorEntrada, boolean incluyeColacion, float total) {
        this.idEntrada = idGlobal;
        idGlobal++;
        this.visitante = visitante;
        this.tipoEntrada = tipoEntrada;
        this.fechaEntrada = fechaEntrada;
        this.valorEntrada = valorEntrada;
        this.incluyeColacion = incluyeColacion;
        this.total = total;
    }
    
    
    public Entrada() {
        this.idEntrada = idGlobal;
        idGlobal++;
        this.visitante = new Visitante();
        this.tipoEntrada = TipoEntrada.none;
        this.fechaEntrada = LocalDate.now();
        this.valorEntrada = 0f;
        this.incluyeColacion = false;
        this.total = 0f;
    }

    public static int getIdGlobal() {
        return idGlobal;
    }

    public static void setIdGlobal(int idGlobal) {
        Entrada.idGlobal = idGlobal;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public float getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(float valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public boolean isIncluyeColacion() {
        return incluyeColacion;
    }

    public void setIncluyeColacion(boolean incluyeColacion) {
        this.incluyeColacion = incluyeColacion;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return   """
                 ***************ENTRADA****************
                 ID ENTRADA: """ + idGlobal + "\n"
                + "Visitante: " + this.visitante.getNombreCliente() + " " + this.visitante.getApellidoCliente() + "\n"
                + "Tipo Entrada: " + tipoEntrada + "\n"
                + "Fecha Entrada: " + fechaEntrada + "\n"
                + "Valor Entrada: " + valorEntrada + "\n"
                + "Colacion: " + incluyeColacion + "\n"
                + "TOTAL: " + total + "\n"
                + "*************************************";
                
        
 //       return "Entrada{" + "idEntrada=" + idEntrada + ", visitante=" + ", tipoEntrada=" + tipoEntrada + ", fechaEntrada=" + fechaEntrada + ", valorEntrada=" + valorEntrada + ", incluyeColacion=" + incluyeColacion + ", total=" + total + '}';
                }
    
    
    
    

    
    
    
}

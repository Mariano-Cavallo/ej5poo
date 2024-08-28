import java.time.LocalDate;

public class Tarea {

    public enum Prioridad{
        ALTA,
        MEDIA,
        BAJA,
    }



    private String titulo;
    private Boolean pendiente;
    private String Descripcion;
    private LocalDate fechaLimite;
    private Boolean completa;
    private Prioridad prioridad;



    public Tarea(String titulo,LocalDate fechaLimite){
        this.titulo = titulo;
        this.fechaLimite = fechaLimite;
        this.pendiente = true;
        this.completa = false;
        this.prioridad = Prioridad.BAJA;
    }
    public Boolean isCompleta(){
        return this.completa;
    }
    public Boolean isPendiente(){
        return this.pendiente;
    }
    public Boolean isVencida(){
        LocalDate fechaActual = LocalDate.now();
        if(fechaActual.isAfter(this.fechaLimite)){
            return false;
        }else{
            return true;
        }
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public void modificarFechaLimite(LocalDate fecha){
        this.fechaLimite = fecha;
    }
    public void completar(){
        this.completa = true;
        this.pendiente = false;
    }
    public void modificarTitulo(String titulo){
        this.titulo = titulo;
    }
    public Boolean aumentarPrioridad(){
        Prioridad prioridad = this.prioridad;
        if(prioridad == Prioridad.ALTA){
            return false;
        }else{
            switch (prioridad){
                case BAJA:
                    this.prioridad = Prioridad.MEDIA;
                    break;
                case MEDIA:
                    this.prioridad = Prioridad.ALTA;
                    break;
            }
            return true;
        }
    }
    public Boolean disminuirPrioridad(){
        Prioridad prioridad = this.prioridad;
        if(prioridad == Prioridad.BAJA){
            return false;
        }else{
            switch (prioridad){
                case ALTA:
                    this.prioridad = Prioridad.MEDIA;
                    break;
                case MEDIA:
                    this.prioridad = Prioridad.BAJA;
                    break;
            }
            return true;
        }
    }
    public String getTitulo(){
        return this.titulo;
    }
    public Prioridad getPrioridad(){
        return this.prioridad;
    }
    public LocalDate getFechaLimite(){
        return this.fechaLimite;
    }






    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", pendiente=" + pendiente +
                ", Descripcion='" + Descripcion + '\'' +
                ", fechaLimite=" + fechaLimite +
                ", completa=" + completa +
                ", prioridad=" + prioridad +
                '}';
    }
}

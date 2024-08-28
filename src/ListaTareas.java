import java.util.ArrayList;
import java.util.Comparator;

public class ListaTareas {

    public ArrayList<Tarea> tareas;
    public String nombre;


    public ListaTareas(String nombre){
        this.nombre = nombre;
        tareas = new ArrayList<Tarea>();
    }
    public int contarTareas(){
        return tareas.size();
    }
    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    public void eliminarTarea(Tarea tarea){
        tareas.remove(tarea);
    }
    public void verCompletas(){
        for(Tarea t: tareas){
            if(t.isCompleta()){
                System.out.print(t);
            }
        }
    }
    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }

    public Boolean existeTarea(String titulo){
        for(Tarea t: tareas){
            if(t.getTitulo().equalsIgnoreCase(titulo)){
                return true;
            }
        }
        return false;
    }

    public Tarea buscarTarea(String titulo){
        for(Tarea t: tareas){
            if(t.getTitulo().equalsIgnoreCase(titulo)){
                return t;
            }
        }
        return null;
    }
    public void listarTareas(){
        for(Tarea t: tareas){
            System.out.print(t);
            System.out.print("\n");
        }
    }
    public void listarTareasAltaP(){
        for(Tarea t: tareas){
            if(t.getPrioridad() == Tarea.Prioridad.ALTA) {
                System.out.print(t);
                System.out.print("\n");
            }

        }
    }
    public void listarTareasMediaP(){
        for(Tarea t: tareas){
            if(t.getPrioridad() == Tarea.Prioridad.MEDIA) {
                System.out.print(t);
                System.out.print("\n");
            }
        }
    }
    public void listarTareasBajaP(){
        for(Tarea t: tareas){
            if(t.getPrioridad() == Tarea.Prioridad.BAJA) {
                System.out.print(t);
                System.out.print("\n");
            }
        }
    }
}

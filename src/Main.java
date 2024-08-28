import java.time.LocalDate;

public class Main {
     public static void main(String[] args) {



         LocalDate fecha1 = LocalDate.of(2024,8,22);
         LocalDate fecha2 = LocalDate.of(2024,1,22);
         LocalDate fecha3 = LocalDate.of(2025,1,22);


         Tarea tarea1 = new Tarea("Comer Pescado",fecha1);
         Tarea tarea2 = new Tarea("Gym",fecha2);
         Tarea tarea3 = new Tarea("Trabajar",fecha3);
         ListaTareas lista1 = new ListaTareas("Cosas que hacer");
         lista1.agregarTarea(tarea1);
         lista1.agregarTarea(tarea2);
         lista1.agregarTarea(tarea3);

         lista1.verCompletas();
         tarea2.completar();
         lista1.verCompletas();
         System.out.print("\n");
         System.out.printf("Cantidad de tareas %d\n",lista1.contarTareas());
         lista1.eliminarTarea(tarea2);
         System.out.printf("Cantidad de tareas %d\n",lista1.contarTareas());
         System.out.print(lista1.existeTarea("trabajar"));
         System.out.print("\n");
         System.out.print(lista1.buscarTarea("trabajar").isCompleta());
         System.out.print("\n");
         lista1.agregarTarea(tarea2);
         lista1.listarTareas();










     }





}

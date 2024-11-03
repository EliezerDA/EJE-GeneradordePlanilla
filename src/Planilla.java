
import java.util.ArrayList;
import java.util.List;

public class Planilla {
    private List<Empleado> empleados; //lista que almacena todos los empleados

    //constructor que inicializa la lista de empleados
    public Planilla(){
        empleados = new ArrayList<>(); // se inicializa la lista de empleados como un ArratList
    }

    //metodo para agrega un empleado a la lista
    public void agregarEmpleado(Empleado empleado){
            empleados.add(empleado); //se añade el empleado a la lista
    }

    //metodo para general el informe de todos los empleados
    public void generarInforme(){
        double totalpagado = 0 ; //variable para acumular el pago total a todos los empleados
        System.out.println("Informe de pagos: ");

        //iterar sobre cada empleado en la lista y muestra su informe
        for (Empleado empleado: empleados) {
            System.out.println(empleado.getInforme());//muestra el informe del empleado actual
            totalpagado += empleado.calcularPagoTotal(); //se acumula el pago de total de empleados
        }
        //imprime el total pagodo a todos los empleados
        System.out.println("Total pagado a todos los empleados: "+totalpagado);
    }
}

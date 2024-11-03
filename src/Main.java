import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Planilla planilla = new Planilla();

        System.out.println("Ingrese la cantidad de empleados");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
            // Ciclo para agregar los empleados
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del empleado:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la identificación del empleado:");
            String identificacion = scanner.nextLine();

            System.out.println("Ingrese el salario base del empleado:");
            double salarioBase = scanner.nextDouble();

            System.out.println("Ingrese las horas extras del empleado:");
            int horasExtras = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // crea un nuevo empleado con los datos ingresados y lo agrega a la planilla
            Empleado empleado = new Empleado(nombre,identificacion,salarioBase,horasExtras);
            planilla.agregarEmpleado(empleado);
        }
        // Genera el informe final de pagos
        planilla.generarInforme();

        scanner.close();
    }
    }

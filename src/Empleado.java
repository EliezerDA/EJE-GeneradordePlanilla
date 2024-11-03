//clase principal que representa un empleado
public class Empleado {
   //atributos de la clase empleado
    private String nombre; //
    private String identificacion;//DUI
    private double salarioBase;
    private int horasExtras;
    private double descuestosSeguroSocial;


    public Empleado(String nombre, String identificacion, double salarioBase, int horasExtras) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.descuestosSeguroSocial = salarioBase * 0.10;//10% de descuento del salario base para seguro
    }


    //metodo para calcular el pago del trabajador
    public double calcularPagoTotal(){
        double tarifaHorario = salarioBase/160; //calcula el pago por hora asumiendo 160h al mes
        double pagoHorasExtras= horasExtras*(tarifaHorario *1.5);//las horas extras se pagan alñ 150%
        return salarioBase + pagoHorasExtras-descuestosSeguroSocial; // salio base + pago horas extras - descuento del ley
    }
// metodo para generar un informe detallado del pago del empleado
    public String getInforme() {
        return String.format("Nombre: %s\nIdentificación: %s\nSalario Base: %.2f\nHoras Extras: %d\nDescuento Seguro Social: %.2f\nPago Total: ",
                nombre, identificacion, salarioBase, horasExtras, descuestosSeguroSocial,calcularPagoTotal());
    }
//obtener el salio base
    public double getSalarioBase() {
        return salarioBase;
    }
}


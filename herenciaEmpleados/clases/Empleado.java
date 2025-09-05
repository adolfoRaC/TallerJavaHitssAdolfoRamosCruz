package ejercicio.clases;

public class Empleado extends Persona {
    private Integer empleadoId;
    private double remuneracion;

    private static Integer contador = 0;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion,
            double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = ++contador;
        this.remuneracion = remuneracion;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public static Integer getContador() {
        return contador;
    }

    public void aumentarRemuneracion(double porcentaje){
        remuneracion = remuneracion + remuneracion * porcentaje;
    }

     @Override
    public String toString() {
        return super.toString() +
               ", ID Empleado: " + empleadoId +
               ", Remuneración: " + remuneracion;
    }

    

    
}

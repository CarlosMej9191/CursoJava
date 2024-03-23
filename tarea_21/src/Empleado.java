public class Empleado extends Persona{

    private double remuneracion;
    private int empleadoId;
    private static int idEAnterior;
    private double porciento;


    public Empleado() {
        this.empleadoId = ++idEAnterior;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){

        this.porciento = (porcentaje * this.remuneracion)/100;
        this.setRemuneracion(this.remuneracion + this.porciento);
        System.out.println("Se ha aumentado un " + porcentaje + "%" + ", siendo un aumento de " + this.porciento + "€, en total su remuneración será de " + this.remuneracion);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nremuneracion =" + remuneracion +
                ", empleadoId =" + empleadoId;
    }
}

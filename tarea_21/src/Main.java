//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNombre("Carlos");
        gerente.setApellido("Mejia");
        gerente.setNumeroFiscal("123456789");
        gerente.setDireccion("Calle 1, Número 3");
        gerente.setRemuneracion(3780.95);
        gerente.setEmpleadoId(335544);
        gerente.setPresupuesto(50000);

        System.out.println(gerente.toString());

        gerente.aumentarRemuneracion(25);

        System.out.println();
        System.out.println(gerente.toString());

    }
}
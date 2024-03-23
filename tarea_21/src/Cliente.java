public class Cliente extends Persona{

    private int clienteId;
    private static int idCAnterior;

    public Cliente() {
        this.clienteId = ++idCAnterior;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nclienteId=" + clienteId;
    }
}

public class BancoPe extends Banco {

    private String nameBank = "BancoPe";
    private double interesCDT =0.025;
    private double porcentajeDeducion = 0.013;
    public BancoPe(double cantidadDinero, double tiempo) {
        super(cantidadDinero, tiempo);
    }

    @Override
    public double calcularInteresCausado() {
        return (getCantidadDinero() * this.interesCDT * getTiempo())/360;
    }

    @Override
    public double calcularImpuestoAhorro() {
        return calcularInteresCausado() * this.porcentajeDeducion;
    }
}

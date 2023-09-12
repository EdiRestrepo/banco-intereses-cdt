public class CoperativaBC extends Banco {


    private String nameBank = "CoperativaBC";
    private double interesCDT =0.0243;
    private double porcentajeDeducion = 0.0207;
    public CoperativaBC(double cantidadDinero, double tiempo) {
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

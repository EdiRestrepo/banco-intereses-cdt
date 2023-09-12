public class BancoAmigo extends Banco {

    private String nameBank = "BancaAmigó";
    private double interesCDT =0.0247;
    private double porcentajeDeducion = 0.017;
    public BancoAmigo(double cantidadDinero, double tiempo) {
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

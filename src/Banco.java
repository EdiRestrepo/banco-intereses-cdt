import java.text.DecimalFormat;

public abstract class Banco {

    private double cantidadDinero;
    private double tiempo;

    private static DecimalFormat df = new DecimalFormat("0.000");

    public Banco(double cantidadDinero, double tiempo) {
        this.cantidadDinero = cantidadDinero;
        this.tiempo = tiempo;
    }

    public abstract double calcularInteresCausado();

    public abstract double calcularImpuestoAhorro();

    public double calcularTotalARetirar(){
        return this.cantidadDinero + calcularInteresCausado();
    }

    public double calcularTotalNetoARetirar(){
        return calcularTotalARetirar()-calcularImpuestoAhorro();
    }

    public void printInformation(){
        System.out.println("Interest: "+ df.format(calcularInteresCausado()));
        System.out.println("Total withdraw: "+ df.format(calcularTotalARetirar()));
        System.out.println("Savings Tax: "+ df.format(calcularImpuestoAhorro()));
        System.out.println("Net witdraw: "+df.format(calcularTotalNetoARetirar()));
        System.out.println("press enter to calculate another value or exit");
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}

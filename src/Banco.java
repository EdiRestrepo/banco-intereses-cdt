public abstract class Banco {

    private String nombreBanco;
    private double cantidadDinero;
    private double tiempo;
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

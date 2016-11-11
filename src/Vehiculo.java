public class Vehiculo {
    private String matricula;
    private double pxd = 50;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {return matricula;}

    public void setMatricula(String matricula) {this.matricula = matricula;}

    public double getPxd() {return pxd;}

    public void setPxd(double pxd) {this.pxd = pxd;}

    public double precioTotal(int dias){return pxd*dias;}
}

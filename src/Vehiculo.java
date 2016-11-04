public class Vehiculo {
    private String matricula;
    private double pxd;

    public Vehiculo(String matricula, double pxd){
        this.matricula = matricula;
        this.pxd = pxd;
    }

    public Vehiculo(){

    }

    public String getMatricula() {return matricula;}

    public void setMatricula(String matricula) {this.matricula = matricula;}

    public double getPxd() {return pxd;}

    public void setPxd(double pxd) {this.pxd = pxd;}
}

public class Camion extends Vehiculo{

    private double PMA;

    public Camion(String matricula, double PMA){
        super(matricula);
        this.PMA=PMA;
    }

    public double getPMA(){return PMA;}
    public void setPMA(double PMA){this.PMA=PMA;}

    @Override
    public double precioTotal(int dias){
        return super.getPxd()*dias+20*PMA+40;
    }
}

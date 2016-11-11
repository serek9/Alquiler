public class Microbus extends Vehiculo{
    private int plazas;
    public Microbus(String matricula, int plazas){
        super(matricula);
        this.plazas = plazas;
    }

    public int getPlazas(){return plazas;}
    public void setPlazas(){}

    @Override
    public double precioTotal(int dias){
        return super.precioTotal(dias)+(plazas*1.5*dias)+(2*plazas);
    }
}

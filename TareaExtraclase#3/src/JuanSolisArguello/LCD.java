package JuanSolisArguello;

public class LCD extends TV {
    private double costosFabricacion;

    public double getCostosFabricacion() {
        return costosFabricacion;
    }

    public void setCostosFabricacion(double costosFabricacion) {
        this.costosFabricacion = costosFabricacion;
    }

    public LCD(String marca, int pulgadas, String color, double precio, double costosFabricacion){
        super(marca,pulgadas,color,precio);
        setCostosFabricacion(costosFabricacion);

    }
    public LCD(){
        setDescripcion("LCD");
    }

}

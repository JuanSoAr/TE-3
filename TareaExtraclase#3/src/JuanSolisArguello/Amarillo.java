package JuanSolisArguello;

public class Amarillo extends Color {
    private boolean esPrimario;
    @Override
    public void Colorea(TV tv) {
        System.out.println("Pintando de amarillo el" + tv.getDescripcion());
    }
    public boolean isEsPrimario(){
        return esPrimario;
    }
    private void setEsPrimario(boolean esPrimario){
        this.esPrimario = esPrimario;
    }
}

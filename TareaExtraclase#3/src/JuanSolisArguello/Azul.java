package JuanSolisArguello;

public class Azul extends Color {
    private boolean esPrimario;

    @Override
    public void Colorea(TV tv) {
        System.out.println("Pintando de azul el" + tv.getDescripcion());
    }
    public boolean isEsPrimario(){
        return esPrimario;
    }
    private void setEsPrimario(boolean esPrimario){
        this.esPrimario = esPrimario;
    }
}


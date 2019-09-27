package JuanSolisArguello;

public abstract class Color {
    private String descripcion;

    public abstract void Colorea(TV tv);

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}


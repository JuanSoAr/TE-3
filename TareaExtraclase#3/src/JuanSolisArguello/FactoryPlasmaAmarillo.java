package JuanSolisArguello;

public class FactoryPlasmaAmarillo extends TvAbstractFactory {
    @Override
    public TV createTV() {
        return new Plasma();
    }

    @Override
    public Color createColor() {
        return new Amarillo();
    }
}

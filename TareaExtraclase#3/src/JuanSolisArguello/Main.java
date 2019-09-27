package JuanSolisArguello;

public class Main {

    public static void main(String[] args) {

        TvAbstractFactory f1 = new FactoryLcdAzul();
        EnsambleTv e = new EnsambleTv(f1);

        TvAbstractFactory f2 = new FactoryPlasmaAmarillo();
        EnsambleTv e1 = new EnsambleTv(f2);
    }
}

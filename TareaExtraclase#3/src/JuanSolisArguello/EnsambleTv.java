package JuanSolisArguello;

public class EnsambleTv {
    public EnsambleTv(TvAbstractFactory factory){
        Color color = factory.createColor();
        TV tv = factory.createTV();
        color.Colorea(tv);
    }
}

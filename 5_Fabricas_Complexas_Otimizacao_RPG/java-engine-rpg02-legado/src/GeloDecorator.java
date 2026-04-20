public class GeloDecorator extends DecoratorArma{
    public GeloDecorator(ItemMagico item) {
        super(item);
    }

    @Override
    public int getPoder() {
        return super.getPoder() + 5;
    }
}

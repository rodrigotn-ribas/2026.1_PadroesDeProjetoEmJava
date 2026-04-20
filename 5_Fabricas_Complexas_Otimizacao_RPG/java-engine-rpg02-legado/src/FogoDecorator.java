public class FogoDecorator extends DecoratorArma{
    public FogoDecorator(ItemMagico item) {
        super(item);
    }

    @Override
    public int getPoder() {
        return super.getPoder() + 7;
    }
}

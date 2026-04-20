public abstract class DecoratorArma implements ItemMagico{
    protected ItemMagico item;

    public DecoratorArma(ItemMagico item){
        this.item = item;
    }

    public int getPoder(){
        return item.getPoder();
    }
}

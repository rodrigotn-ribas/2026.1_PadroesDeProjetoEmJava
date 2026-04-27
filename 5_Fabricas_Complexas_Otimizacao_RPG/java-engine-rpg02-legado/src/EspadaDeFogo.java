public class EspadaDeFogo extends EspadaBase {
    @Override
    public int getPoder() {
        return super.getPoder() + 5; // Adiciona dano de fogo
    }
}
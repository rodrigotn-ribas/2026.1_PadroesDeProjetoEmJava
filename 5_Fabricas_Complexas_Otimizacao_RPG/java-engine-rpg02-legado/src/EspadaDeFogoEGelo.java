// ERRO: Explosão de subclasses. Se adicionarmos "Veneno", "Raio" e "Luz",
// teremos de criar dezenas de combinações através de herança!
public class EspadaDeFogoEGelo extends EspadaDeFogo {
    @Override
    public int getPoder() {
        return super.getPoder() + 5; // O Fogo já vem do 'super', e agora somamos o Gelo
    }
}

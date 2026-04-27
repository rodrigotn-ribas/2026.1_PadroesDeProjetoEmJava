public class Goblin implements Cloneable{
    private String nome;
    private int vida;

    // ERRO: Construtor extremamente pesado.
    // Fazer 'new' nisto muitas vezes vai congelar o jogo.
    public Goblin() {
        this.nome = "Goblin Básico";
        this.vida = 100;

        try {
            // Simula o carregamento de Inteligência Artificial e Texturas 3D
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Goblin clone(){
        try{
            return (Goblin) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public void exibir() {
        System.out.println("Monstro: " + nome + " | Vida: " + vida);
    }
}
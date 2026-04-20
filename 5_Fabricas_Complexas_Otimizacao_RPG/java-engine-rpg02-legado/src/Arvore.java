public class Arvore {
    private int x;
    private int y;

    private TipoArvore tipo;

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void renderizar() {
        System.out.println("Renderizando árvore em (" + x + "," + y + ") com textura de 50MB.");
    }
}
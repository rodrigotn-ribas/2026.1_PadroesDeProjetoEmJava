import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MOTOR DE RPG (CÓDIGO LEGADO) ===\n");

        // ------------------------------------------------------------------------
        // LABORATÓRIO 1: Abstract Factory
        // O programador cria os itens manualmente com 'ifs'.
        // Risco alto: Um erro de digitação e o Elfo recebe equipamento de Orc.
        // ------------------------------------------------------------------------
        FabricaEquipamentos fabricaOrc = new FabricaOrquica();
        Arma armaOrc = fabricaOrc.criarArma();
        Armadura armaduraOrc = fabricaOrc.criarArmadura();

        FabricaEquipamentos fabricaElfo = new FabricaElfica();
        Arma armaElfo = fabricaElfo.criarArma();
        Armadura armaduraElfo = fabricaElfo.criarArmadura();

        System.out.println("ORCS");
        armaOrc.exibir();
        armaduraOrc.exibir();

        System.out.println();
        System.out.println("ELFO");
        armaElfo.exibir();
        armaduraElfo.exibir();

        System.out.println();

        // ------------------------------------------------------------------------
        // LABORATÓRIO 2: Prototype
        // O jogo tenta criar 1000 monstros chamando o construtor lento.
        // Vai demorar cerca de 10 segundos apenas para gerar a horda!
        // ------------------------------------------------------------------------
        System.out.println("--- 2. Gerando Horda de Monstros ---");
        System.out.println("A carregar monstros (Isto vai demorar...)");
        long tempoInicio = System.currentTimeMillis();
        List<Goblin> horda = new ArrayList<>();
        Goblin goblin = new Goblin();
        for (int i = 0; i < 1000; i++) {
            horda.add(goblin.clone());
        }
        long tempoFim = System.currentTimeMillis();
        System.out.println("1000 Goblins gerados em " + (tempoFim - tempoInicio) + " ms.");
        System.out.println();

        // ------------------------------------------------------------------------
        // LABORATÓRIO 3: Decorator
        // A espada está engessada na hierarquia de classes.
        // ------------------------------------------------------------------------
        System.out.println("--- 3. Espada Mágica ---");
        ItemMagico espadaFogoGelo = new FogoDecorator(new GeloDecorator(new EspadaBase()));
        System.out.println("Poder da espada combinada (Fogo + Gelo): " + espadaFogoGelo.getPoder());
        System.out.println();

        // ------------------------------------------------------------------------
        // LABORATÓRIO 4: Flyweight
        // Cada árvore carrega os seus próprios 50MB.
        // Simulamos a criação de 10.000 árvores (na vida real isto daria OutOfMemoryError).
        // ------------------------------------------------------------------------
        System.out.println("--- 4. Renderizando Floresta ---");
        List<Arvore> floresta = new ArrayList<>();
        String texturaPesada = "TEXTURA_VERDE_HD_50MB_DADOS_BINARIOS..."; // Simulando objeto pesado

        for (int i = 0; i < 10000; i++) {
            // A mesma String pesada é guardada 10.000 vezes em memória
            TipoArvore tipo = GerenciadorDeArvores.getTipoArvore(texturaPesada);
            floresta.add(new Arvore(5, 10, tipo));
        }
        System.out.println("Floresta criada com 10.000 árvores pesadas na memória!");
    }
}
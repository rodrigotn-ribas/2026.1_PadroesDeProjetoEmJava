**🎮 Motor de RPG - Fábricas Complexas e Otimização (Módulo 5)**

Bem-vindo(a) ao repositório oficial do Módulo 5 da disciplina de Padrões de Projetos de Software.

**📜 O Contexto (A Sua Missão)**

Você foi contratado(a) como Arquiteto(a) de Software para salvar a "Game Engine" (Motor de Jogo) de um novo RPG de Fantasia que está prestes a ser lançado. O jogo é divertido, mas a forma como os objetos são criados internamente está destruindo a performance e tornando a manutenção um pesadelo.

**🚨 Os Sintomas (O que você vai consertar):**

Bugs de Equipamento: O código de criação de personagens está usando ifs gigantescos. Vira e mexe, um Elfo aparece usando a armadura pesada de um Orc devido a erros de digitação na classe Main.

Travamentos (Lag): O jogo "congela" na hora de gerar hordas de inimigos, pois o processador não aguenta criar 10.000 Goblins do zero simultaneamente.

Explosão de Classes: Para cada nova combinação de magia nas armas (Fogo, Gelo, Veneno), um desenvolvedor cria uma nova subclasse (ex: EspadaDeFogoEGelo), poluindo o sistema.

Falta de Memória RAM: Renderizar uma floresta no jogo dá "Out of Memory", pois cada árvore está carregando uma cópia idêntica de uma textura de 50MB dentro de si.

A sua missão é "salvar o jogo" otimizando o consumo de recursos e criando estruturas dinâmicas utilizando os Padrões de Criação e Estruturais (GoF), além da Invenção Pura (GRASP).

**🛠️ Como iniciar o laboratório**

Abra o IntelliJ IDEA.

Na tela de boas-vindas, clique em Get from VCS.

Cole a URL deste repositório:

[https://github.com/prof-salu/java-engine-rpg02-legado](https://github.com/prof-salu/java-engine-rpg02-legado)


Clique em Clone e em seguida Trust Project.

No painel de projeto à esquerda, expanda a pasta azul src e abra o arquivo Main.java para ver o jogo travando e consumindo memória.

**🎯 Laboratórios de Refatoração**

Siga a sua Apostila de Laboratório para aplicar as correções abaixo:

**1. A Forja do Ferreiro (Abstract Factory)**

Objetivo: Garantir que itens de uma mesma família (Élfica ou Orc) sejam criados juntos, eliminando condicionais perigosas do Main.

Ação: Criar a interface FabricaEquipamentos e as suas classes concretas para agrupar a criação de armaduras e armas por raça.

**2. O Exército das Trevas (Prototype)**

Objetivo: Parar de chamar o construtor lento do Goblin milhares de vezes.

Ação: Implementar a interface Cloneable e fazer a mitose celular: criar apenas um Goblin mestre e cloná-lo rapidamente para formar a horda.

**3. A EspadaBase Mágica (Decorator)**

Objetivo: Adicionar magias a uma arma de forma acumulativa sem precisar usar herança ou criar novas classes filhas.

Ação: Criar decoradores (FogoDecorator, GeloDecorator) que "envolvem" a espada original e somam poderes de ataque dinamicamente.

**4. A Floresta Interminável (Flyweight + Pure Fabrication)**

Objetivo: Renderizar 10.000 árvores consumindo apenas 50MB de RAM (em vez de 500GB).

Ação: Separar o estado extrínseco (Posição X, Y) do intrínseco (A textura pesada). Usar uma classe inventada (GerenciadorDeArvores) para guardar as texturas em cache e compartilhá-las entre todas as árvores.

**⚠️ Regra de Ouro do Repositório**

Existe uma branch neste repositório chamada solucao que contém o código perfeitamente otimizado pela nossa equipe sênior.

NÃO MUDE PARA A BRANCH SOLUÇÃO ANTES DE TENTAR! A graça deste módulo é ver a memória RAM estourar e o jogo travar na sua própria máquina. Tente aplicar as melhorias lendo o catálogo da apostila para fixar o aprendizado!

Bom jogo e boa otimização! 🚀

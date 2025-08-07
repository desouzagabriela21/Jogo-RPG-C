# Jogo de RPG em java elaborado nas aulas de programação do DTA Bosch

Criando um Personagem de RPG com Java: Este projeto simula personagens de um jogo de RPG (Role Playing Game) utilizando os princípios da Programação Orientada a Objetos. A aplicação é desenvolvida em Java e executada no terminal, permitindo a criação, personalização e simulação de ações de diferentes classes de personagens.

Objetivo do Projeto: Praticar os pilares da Programação Orientada a Objetos (POO), como encapsulamento, abstração e polimorfismo, através da criação de uma classe Personagem com atributos e comportamentos típicos de jogos de RPG.

A classe Personagem possui os seguintes recursos:

Atributos

String nome: Nome do personagem

String classe: Classe do personagem (por exemplo: Guerreiro, Mago, Arqueiro)

int nivel: Inicia em 1

int vida: Valor máximo de 100

int mana: Apenas para Magos, valor máximo de 100

int forca: Determinada pela classe

Métodos Implementados:

void atacar(): Exibe uma mensagem personalizada de ataque conforme a classe

void receberDano(int dano): Reduz a vida do personagem, respeitando o mínimo de 0

void usarHabilidadeEspecial(): Executa uma habilidade especial diferente para cada classe

void mostrarStatus(): Mostra os atributos atuais do personagem

void subirNivel(): Aumenta o nível e melhora os atributos (vida, força e mana se aplicável)

void desenharPersonagem(int personagem): Exibe uma arte ASCII do personagem, com base no número passado como parâmetro

Regras: 

A vida do personagem não pode ultrapassar 100

A mana, quando aplicável, também não pode ultrapassar 100

Ao receber dano, a vida nunca deve ficar abaixo de 0

O uso da habilidade especial deve reduzir mana, se aplicável


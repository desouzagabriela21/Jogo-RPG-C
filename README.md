# Jogo de RPG em java elaborado nas aulas de programação do DTA Bosch

Criando um Personagem de RPG com Java
Este projeto simula personagens de um jogo de RPG (Role Playing Game) utilizando os princípios da Programação Orientada a Objetos (POO). A aplicação é desenvolvida em Java e executada via terminal, permitindo a criação, personalização e simulação de ações de diferentes classes de personagens.

Objetivo do Projeto
Praticar os pilares da POO — como encapsulamento, herança (opcional), polimorfismo e abstração — através da criação de uma classe Personagem com atributos e comportamentos típicos de jogos de RPG.

Funcionalidades
A classe Personagem possui os seguintes recursos:

Atributos
String nome: Nome do personagem.
String classe: Classe do personagem (Guerreiro, Mago, Arqueiro, etc.).
int nivel: Inicia em 1.
int vida: Valor máximo de 100.
int mana: Apenas para Mago, valor máximo de 100.
int forca: Determinada pela classe.

Métodos Implementados
atacar(): Exibe uma mensagem personalizada de ataque, de acordo com a classe.
receberDano(int dano): Reduz a vida do personagem (mínimo 0).
usarHabilidadeEspecial(): Executa uma habilidade única por classe (ex: mago lança feitiço).
mostrarStatus(): Mostra os atributos atuais do personagem.
subirNivel(): Aumenta o nível e melhora atributos (vida, força, mana).
desenharPersonagem(int personagem): Exibe o personagem com arte ASCII, de forma criativa.

Regras Implementadas
Vida e mana limitadas a no máximo 100.
Vida nunca pode ser menor que 0.
Uso da habilidade especial consome mana (se aplicável).

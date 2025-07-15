import java.util.Scanner;

public class JogoRPG {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RPG personagem1 = new RPG();
        personagem1.criarPersonagem();
        personagem1.desenharPersonagem();

        RPG personagem2 = new RPG();
        personagem2.criarPersonagem();
        personagem2.desenharPersonagem();
        
        int jogador = 1;
        int opcao;
        boolean reiniciar = true;

        while (reiniciar == true) {
            while (personagem1.vida > 0 && personagem2.vida > 0) {
                System.out.printf("\n\nÉ a vez do jogador %d!", jogador);
                System.out.printf("\n1 - Atacar\n2 - Ataque especial\n3 - Elixir de vida\nOpçao: ");

                do {
                    opcao = scanner.nextInt();
                    
                    switch(opcao) {

                        case 1:
                            if (jogador == 1) {
                                personagem1.atacar();
                                personagem2.receberDano();
                            } else {
                                personagem2.atacar();
                                personagem1.receberDano();
                            }
                            break;
                        
                        case 2: if (jogador == 1){
                            personagem1.usarHabilidadeEspecial();
                            if (personagem1.vida >= 85){
                                personagem2.receberDanoAtaqueEspecial();
                            }
                            } else {
                                personagem2.usarHabilidadeEspecial();
                                if (personagem2.vida >= 85){
                                    personagem1.receberDanoAtaqueEspecial();
                                    }
                            } break;

                        case 3:
                            if (jogador == 1) {
                                if (personagem1.vida < 90) {
                                    personagem1.vida += 10; 
                                    System.out.printf("Vida +10\nVida atual: %d\n", personagem1.vida);
                                    if (personagem1.classe.equals("Mago")) {
                                        if (personagem1.mana < 90) {
                                            personagem1.mana += 10;
                                            System.out.printf("Mana +10\nMana atual: %d\n", personagem1.mana);
                                        }
                                    }
                                } else {
                                    System.out.println("Elixir indisponível!");
                                }
                            } else {
                                if (personagem2.vida < 90) {
                                    personagem2.vida += 10; 
                                    System.out.printf("Vida +10\nVida atual: %d\n", personagem2.vida);
                                    if (personagem2.classe.equals("Mago")) {
                                        if (personagem2.mana < 90) {
                                            personagem2.mana += 10;
                                            System.out.printf("Mana +10\nMana atual: %d\n", personagem2.mana);
                                        }
                                    } 
                                } else {
                                    System.out.println("Elixir indisponível!"); 
                                }
                            }
                            break;
                        
                        default:
                            System.out.printf("Opçao inválida!\nOpçao: ");
                            break;

                    }
                } while (opcao != 1 && opcao != 2 && opcao != 3);

                if (jogador == 1) {
                    jogador = 2;
                } else {
                    jogador = 1;
                }
            }

            if (personagem1.vida <= 0) {
                System.out.printf("\nO jogador 2 venceu!");
                personagem2.desenharPersonagem();
                personagem2.subirNivel();
            } 
            if (personagem2.vida <= 0) {
                System.out.printf("\nO jogador 1 venceu!");
                personagem1.desenharPersonagem();
                personagem1.subirNivel();
            } 

            System.out.print("Deseja reiniciar o jogo?\n1 - Sim\n2 - Nao\nOpçao:");
            opcao = scanner.nextInt();
            if (opcao == 2) {
                reiniciar = false; 
                System.out.println("\n======FIM DE JOGO======");
                break;
            }
            
            if (opcao == 1) {
                reiniciar = true;
                personagem1.vida = 100;
                personagem2.vida = 100;
                if (personagem1.classe.equals("Mago")) {
                    personagem1.mana = 100;
                }
                if (personagem2.classe.equals("Mago")) {
                    personagem2.mana = 100;
                }
            }

        }
    }
}
import java.util.Scanner;

public class RPG {

    public String nome;
    public String classe;
    public int nivel = 1;
    public int vida = 100;
    public int mana = 100;
    public int forca;

    public void mostrarStatus(){
        if (classe.equals("Mago")){
            System.out.printf("\nStatus: ");
            System.out.printf("\nNome: %s|Classe: %s|Nível: %d|Vida: %d|Força: %d |Mana: %d|\n", nome, classe, nivel, vida, forca, mana);
        } else {
            System.out.printf("\nStatus: ");
            System.out.printf("\nNome: %s|Classe: %s|Nível: %d|Vida: %d|Força: %d|\n", nome, classe, nivel, vida, forca);
        }
    }

    public void atacar(){
        System.out.printf("\nO %s %s atacou seu oponente!", classe, nome);
        if (classe.equals("Mago")){
            mana -= 10;
            System.out.printf("\nMana: %d", mana);
        }
    }

    public void receberDano(){
        System.out.printf("\nO %s %s foi atacado por seu oponente!", classe, nome);
        vida -= (int)(Math.random() * 31);
        System.out.printf("\nVida: %d",vida);
        if(vida <= 0){
            System.out.printf("\n%s morreu!\nFim de jogo!", nome);
        }
    }

    public void receberDanoAtaqueEspecial(){
        System.out.printf("\nO %s %s foi atacado por seu oponente!", classe, nome);
        vida -= (int)(Math.random() * 31);
        vida -= 15;
        System.out.printf("\nVida atual: %d",vida);
        if(vida <= 0){
            System.out.printf("\n%s morreu!\nFim de jogo!", nome);
        }
    }

    public void usarHabilidadeEspecial(){
        if(classe.equals("Guerreiro")){
            if (vida >= 85){
                System.out.printf("\nO %s %s atacou seu oponente COM SEU SUPER MACHADO!", classe, nome);
            } else {
                System.out.printf("\nO %s %s não tem força para um ataque especial!", classe, nome);
            } 
        }
        if(classe.equals("Arqueiro")){
            if (vida >= 85){
                System.out.printf("\nO %s %s atacou seu oponente COM SUA SUPER FLECHA!", classe, nome);
            } else {
                System.out.printf("\nO %s %s não tem força para um ataque especial!", classe, nome);
            } 
        }
        if(classe.equals("Mago")){
            if (mana >= 85 && vida >= 85){
                System.out.printf("\nO %s %s atacou seu oponente COM SEU SUPER FEITIÇO!", classe, nome);
                mana -= (int)(Math.random() * 31);
                mana -= 15;
                System.out.printf("\nMana: %d", mana);
            } else {
                System.out.printf("\nO %s %s não tem força para um ataque especial!", classe, nome);
            } 
        }    
    }
    
    public void subirNivel(){
        if(classe.equals("Mago")){
            forca += 10;
            vida = 100;
            nivel += 1;
            mana = 100;
            System.out.printf("\nParabéns!\nO %s %s subiu de nível! Agora está no nível %d\n", classe, nome, nivel);
            mostrarStatus();
        } else {
            forca += 10;
            vida = 100;
            nivel += 1;
            System.out.printf("\nParabéns!\nO %s %s subiu de nível! Agora está no nível %d\n", classe, nome, nivel);
            mostrarStatus();
        }
    }

    public void desenharPersonagem(){
        if(classe.equals("Guerreiro")){
            System.out.println("\n   O   /\\");
            System.out.println("  /|\\ /  \\");
            System.out.println("   |  \\__/ ");
            System.out.println("  / \\     ");
        }
        if (classe.equals("Mago")){
            System.out.println("\n   ^");
            System.out.println("  /_\\");
            System.out.println("   O");
            System.out.println("  /|\\");
            System.out.println("   |");
            System.out.println("  / \\");
        }
        if (classe.equals("Arqueiro")){
            System.out.println("\n   O");
            System.out.println("  /|\\ )>");
            System.out.println("   |   ");
            System.out.println("  / \\");
        }
    }

    public void criarPersonagem(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nNome do personagem: ");
        nome = scanner.nextLine();
        int opcao;

        do {
            System.out.println("Escolha a classe do seu personagem: ");
            System.out.print("1 - Guerreiro\n2 - Mago\n3 - Arqueiro\nOpçao: ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    classe = "Guerreiro";
                    forca = 50;
                    System.out.printf("\nHerói criado: %s (%s)\n", nome, classe);
                    mostrarStatus();
                    break;
                
                case 2:
                    classe = "Mago";
                    mana = 100;
                    forca = 30;
                    System.out.printf("\nHerói criado: %s (%s)\n", nome, classe);
                    mostrarStatus();
                    break;

                case 3:
                    classe = "Arqueiro";
                    forca = 40;
                    System.out.printf("\nHerói criado: %s (%s)\n", nome, classe);
                    mostrarStatus();
                    break;

                default: 
                    System.out.println("Opção inválida!"); 
                    break;
            }
        } while (opcao != 1 && opcao != 2 && opcao != 3);
    }
}

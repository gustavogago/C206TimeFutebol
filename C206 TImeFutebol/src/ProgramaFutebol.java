import java.util.*;

public class ProgramaFutebol {
    private static Scanner scanner = new Scanner(System.in);
    private static GerenciadorDeTimes gerenciador = new GerenciadorDeTimes();

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Escolha uma opção: [1] Criar [2] Ler [3] Atualizar [4] Deletar [0] Sair");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer depois de ler o número
                switch (opcao) {
                    case 1:
                        adicionarTime();
                        break;
                    case 2:
                        mostrarTimes();
                        break;
                    case 3:
                        atualizarTime();
                        break;
                    case 4:
                        deletarTime();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // Limpa o buffer para evitar leituras errôneas nas próximas iterações
            }
        }
    }

    private static void adicionarTime() {
        try {
            System.out.println("Digite o ID do time:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o nome do time:");
            String nome = scanner.nextLine();

            System.out.println("O time é campeão mundial? (sim/nao):");
            String campeaoInput = scanner.nextLine();
            boolean campeaoMundial = campeaoInput.equalsIgnoreCase("sim");
            int quantasVezes = 0;
            if (campeaoMundial) {
                System.out.println("Quantas vezes o time foi campeão mundial?");
                quantasVezes = scanner.nextInt();
                scanner.nextLine();
            }
            gerenciador.criar(new TimeFutebol(id, nome, campeaoMundial, quantasVezes));
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira dados corretos para o time.");
            scanner.nextLine(); // Limpa o buffer para evitar conflitos de entrada
        }
    }

    private static void mostrarTimes() {
        List<TimeFutebol> times = gerenciador.ler();
        for (TimeFutebol time : times) {
            System.out.println(time);
        }
    }

    private static void atualizarTime() {
        try {
            System.out.println("Digite o ID do time que deseja atualizar:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o novo nome do time:");
            String nome = scanner.nextLine();

            System.out.println("O time é campeão mundial? (sim/nao):");
            String campeaoInput = scanner.nextLine();
            boolean campeaoMundial = campeaoInput.equalsIgnoreCase("sim");
            int quantasVezes = 0;
            if (campeaoMundial) {
                System.out.println("Quantas vezes o time foi campeão mundial?");
                quantasVezes = scanner.nextInt();
                scanner.nextLine();
            }
            gerenciador.atualizar(new TimeFutebol(id, nome, campeaoMundial, quantasVezes));
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira dados corretos para a atualização.");
            scanner.nextLine();
        }
    }

    private static void deletarTime() {
        try {
            System.out.println("Digite o ID do time que deseja deletar:");
            int id = scanner.nextInt();
            scanner.nextLine();
            gerenciador.deletar(id);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um ID numérico.");
            scanner.nextLine();
        }
    }
}

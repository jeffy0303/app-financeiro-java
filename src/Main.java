import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        ArrayList<Movimentacao> movimentacoes = new ArrayList<>();

        boolean executando = true;

        while (executando) {

            System.out.println("\n=== MeuFinanceiro ===");
            System.out.println("1 - Adicionar movimentação");
            System.out.println("2 - Ver histórico");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    Movimentacao mov = new Movimentacao();

                    System.out.println("Digite um valor: ");
                    mov.valor = sc.nextDouble();

                    System.out.println("É receita ou despesa? ");
                    mov.tipo = sc.next();

                    System.out.println("Digite a descrição: ");
                    mov.descricao = sc.next();

                    System.out.println("Digite a categoria: ");
                    mov.categoria = sc.next();

                    movimentacoes.add(mov);

                    if (mov.tipo.equalsIgnoreCase("receita")) {
                        saldo += mov.valor;

                    } else if (mov.tipo.equalsIgnoreCase("despesa")) {
                        saldo -= mov.valor;

                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    System.out.println("Histórico:");

                    if (movimentacoes.isEmpty()) {
                        System.out.println("Nenhuma movimentação cadastrada.");
                    }

                    for (Movimentacao movimentacao : movimentacoes) {
                        System.out.println("Tipo: " + movimentacao.tipo +
                                " | Valor: R$ " + movimentacao.valor +
                                " | Descrição: " +movimentacao.descricao +
                                " | Categoria: " +movimentacao.categoria);

                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida");

            }

        }

        System.out.println("Programa finalizado!");
    }}
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        ArrayList<Movimentacao> movimentacoes = new ArrayList<>();
        char continuar = 's';

        while (continuar == 's') {

        Movimentacao mov = new Movimentacao();

        System.out.println("Digite um valor: ");
        mov.valor = sc.nextDouble();

        System.out.println("É receita ou despesa? ");
        mov.tipo = sc.next();

        movimentacoes.add(mov);

            if (mov.tipo.equals("receita")) {
                saldo += mov.valor;
            } else {
                saldo -= mov.valor;
            }

            System.out.println("Saldo atual: " + saldo);

            System.out.println("Histórico:");

            for (Movimentacao movimentacao : movimentacoes) {

                System.out.println(mov.tipo + " - " + mov.valor);

            }
                System.out.println("Deseja continuar?");
            continuar = sc.next().toLowerCase().charAt(0);
        }

        System.out.println("Programa finalizado!");
    }
}
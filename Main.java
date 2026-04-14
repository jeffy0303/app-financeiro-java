import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		double saldo = 0;
		char continuar = 's';
		
		while (continuar == 's') {

		System.out.println("Digite um valor: ");
		double valor = sc.nextDouble();
		
        System.out.println("É receita ou despesa? ");
        String tipo = sc.next();
        
        if (tipo.equals("receita")){
            saldo += valor;
        } else{
            saldo -= valor;
        }

		System.out.println("Saldo atual: "+saldo);
		
		System.out.println("Deseja continuar?");
		continuar = sc.next().toLowerCase().charAt(0);}
		
		System.out.println("Programa finalizado!");
	}
}

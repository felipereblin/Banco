package banco;
import java.util.ArrayList;
import java.util.Scanner;

import banco.modelo.Cliente;
import banco.modelo.Conta;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Conta> banco = new ArrayList<>();
		
		Cliente cliente = new Cliente();
		Conta conta;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("---------CLIENTE---------");
		
		System.out.println("Informe o CPF");
		long cpf = entrada.nextLong();
		cliente.setCpf(cpf);
		
		System.out.println("Informe o RG");
		cliente.setRg(entrada.nextLong());
		entrada.nextLine();
		
		System.out.println("Informe o nome");
		cliente.setNome(entrada.nextLine());
		
		System.out.println("Informe o endereço");
		cliente.setEndereco(entrada.nextLine());
		
		System.out.println("Informe o telefone");
		cliente.setTelefone(entrada.nextLong());
		entrada.nextLine();
		
		System.out.println("Informe a renda mensal");
		cliente.setRendaMensal(entrada.nextDouble());
		entrada.nextLine();
		
		System.out.println("---------CONTA---------");
		
		System.out.println("Informe a agência");
		int agencia = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Informe o número da conta");
		int numero = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Informe o saldo");
		double saldo = entrada.nextDouble();
		entrada.nextLine();
		
		conta = new Conta(agencia, numero, cliente, saldo);
		
		System.out.println("---------Conta Corrente---------");
		System.out.println(conta);
		
		entrada.close();
	}

}

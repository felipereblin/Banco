package banco;
import java.util.ArrayList;
import java.util.Scanner;

import banco.dao.DbConnection;
import banco.modelo.Cliente;
import banco.modelo.Conta;
import banco.modelo.Pessoa;


public class Principal {

	public static void main(String[] args) {

		DbConnection pdb = new DbConnection();
		
		Cliente c1 = new Cliente(0, "Jose", "Rua Loka", 222222, 00000, 555555, 15000);
		Cliente c2 = new Cliente(0, "Jose", "Rua Loka", 111111, 77777, 888888, 17000);
		
		pdb.addCliente(c1);
		pdb.addCliente(c2);
		
		System.out.println("Base Inicial: ");
		for (Cliente cliente : pdb.getClientes()) {
			System.out.println(cliente);
			System.out.println("----------------------------------");
		}
		
		c1.setEndereco("Rua legal");
		c2.setNome("Felipe");
		
		pdb.updateCliente(c1);
		pdb.updateCliente(c2);
		
		System.out.println("Pós Update: ");
		for (Cliente cliente : pdb.getClientes()) {
			System.out.println(cliente);
			System.out.println("----------------------------------");
		}
		
		pdb.deleteCliente(1);
		
		System.out.println("Pós delete: ");
		for (Cliente cliente : pdb.getClientes()) {
			System.out.println(cliente);
			System.out.println("----------------------------------");
		}
	}
}
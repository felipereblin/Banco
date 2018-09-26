package banco.modelo;
public class Conta {
	private int agencia;
	private int numero;
	private Cliente cliente;
	private double saldo;
	
	public Conta(int agencia, int numero, Cliente cliente, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Agência: " + getAgencia() + "\n"
				+ "Número Conta: " + getNumero() + "\n"
				+ "Cliente: " + getCliente() + "\n"
				+ "Saldo: R$" + getSaldo();
	}
	
	
}


public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, int agencia) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
	@Override
	public void sacar(double valor) {
		double valorASacar = valor + 0.1;
	    super.sacar(valorASacar);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}
	
}

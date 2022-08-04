
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, int agencia) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}

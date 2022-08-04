
public class Main {

	public static void main(String[] args) {
		Cliente leo = new Cliente();
		leo.setNome("Leo");
		
		Conta cc = new ContaCorrente(leo, 0001);
		Conta poupanca = new ContaPoupanca(leo, 0001);

		cc.depositar(100);	
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

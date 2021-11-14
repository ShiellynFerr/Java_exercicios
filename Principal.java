package POO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBanco cliente1 = new ContaBanco();
		cliente1.setNumConta(7532);
		cliente1.setDono("Bernardo");
		cliente1.abrirConta("CC");
		cliente1.depositar(100);
		cliente1.sacar(20);

		
		
		ContaBanco cliente2 = new ContaBanco();
		
		cliente2.setNumConta(2914);
		cliente2.setDono("Veronica");
		cliente2.abrirConta("CP");
		cliente2.depositar(500);
		cliente2.sacar(100);
		cliente2.sacar(1000);
		
		
		
		cliente1.estadoAtual();
		cliente2.estadoAtual();
		
	
	}

}

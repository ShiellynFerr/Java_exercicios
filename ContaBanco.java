package POO;

public class ContaBanco {

	// atributos

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	// construtor
	public ContaBanco() {

	}

	// m�todos

   public void estadoAtual() {
	   System.out.println("-----------------------------------------------------------------------------");
	   System.out.println("Conta:" + this.getNumConta());
	   System.out.println("Tipo:" + this.getTipo());
	   System.out.println("Dono:" + this.getDono());
	   System.out.println("Saldo: " + this.getSaldo());
	   System.out.println("Status:" + this.getStatus());
   }

	public void abrirConta(String T) {
		this.setTipo(T);
		this.setStatus(true);
		if (T == "CC") {
			this.setSaldo(50);
		} else if (T == "CP") {

			this.setSaldo(150);
		}

		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (getSaldo() > 0) {
			System.out.println("A conta n�o pode ser fechada, porqu� ainda possui saldo");
		} else if (getSaldo() < 0) {

			System.out.println("A conta n�o pode ser fechada pois possui d�bito");
		} else {

			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float V) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + V);
			System.out.println("Dep�sito realizado na conta de " + this.getDono());
		} else {
			System.out.println("impossivel depositar em uma conta fechada!");
		}
	}

	public void sacar(float V) {
		if (this.getStatus()) {
			if (this.getSaldo() >= V) {
				this.setSaldo(this.getSaldo() - V);
				System.out.println("Saque realizado na conta de" + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque.");
			}

		} else {
			System.out.println("Conta fechada, n�o � possivel realizar o saque.");
		}
	}

	public void pagarMensal() {

		// declara��o de var�avel local
		int m = 0;
		if (this.getTipo() == "CC") {
			m = 12;
		} else if (this.getTipo() == "CP") {
			m = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - m);
			System.out.println("Mensalidade paga com sucesso!");
		} else {
			System.out.println("Conta fechada, impossivel pagar mensalidade");
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}

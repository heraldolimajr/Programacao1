
public class Operacoes {

	private String nomeOperacao;
	private Object valor;

	public String getNomeOperacao() {
		return nomeOperacao;
	}

	public void setNomeOperacao(String nomeOperacao) {
		this.nomeOperacao = nomeOperacao;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Operacoes [nomeOperacao=" + nomeOperacao + "]";
	}

	public void imprime(Object valor) {
		System.out.println("O valor recebido foi:" + valor);
	}

	public boolean verifica(Object valor) {
		return this.valor.equals(valor);
	}

	public boolean equals(Object object) {
		
		if (object == null) {
			return false;
		}
		if (this.valor.equals(object)) {
			return true;
		}
		return false;
	}

}

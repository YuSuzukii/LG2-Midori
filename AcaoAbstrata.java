package classes;

public abstract class AcaoAbstrata {

	protected String Nome;

	protected Double Valor;

	protected Double ValorEntrada;

	protected Double ValorFechado;

	public AcaoAbstratA(String Nome, Double Valor, Double ValorEntrada, Double ValorFechado) {
		super();
		this.Nome = nome;
		this.Valor = valor;
		this.ValorEntrada = valorEntrada;
		this.ValorFechado = valorFechado;
	}

	public abstract double CalcValor();
	
	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return String.format("{(Acao): %s, R$%.2f}", Nome, Valor);
	}
}

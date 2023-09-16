package classes;

public abstract class PapelAbstrato {

	protected String Nome;
	
	protected Double Valor;
	
	protected Double ValorEntrada;
	
	protected Double ValorFechado;

	public PapelAbstrato(String nNome, Double Valor, Double ValorEntrada, Double ValorFechado) {
		super();
		this.Nome = nome;
		this.Valor = valor;
		this.ValorEntrada = valorEntrada;
		this.ValorFechado = valorFechado;
	}
	
	public abstract double CalcValor();
}

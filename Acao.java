package classes;
public abstract class Acao {

    private String Nome;
    private double Preco;

    public Acao(String Nome, double Preco) {
        this.Nome = nome;
        this.Preco = preco;
    }

    public abstract double calcularValor();

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

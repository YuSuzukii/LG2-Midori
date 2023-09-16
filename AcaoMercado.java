package classes;
public class AcaoMercado extends Acao {

    private int Cotas;
    private Empresa empresa;

    public AcaoMercado(String Nome, double Preco, int Cotas, Empresa empresa) {
        super(Nome, Preco);
        this.Cotas = cotas;
        this.Empresa = empresa;
        Empresa.comprarCotas(Cotas);
    }

    @Override
    public double CalcValor() {
        return getPreco() * Cotas;
    }

    public String getEmpresa() {
        return Empresa.getNome();
    }
}

package projeto.cafeteria;

public abstract class Produto {
	protected double preco;
	private double precoTotal;
	protected String detalhe;
	private FormaPagamento formaPagamento;
	
	public abstract String getTodosDetalhes();
	public abstract double consumo();
	
	
	public void setDetalhes(String detalhe) {
		this.detalhe = detalhe;
	}
	
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public double valorTotal() {
		precoTotal = this.formaPagamento.valorTotal(this);
		return precoTotal;
	} 
	public double getPreco() {
		return preco;
	}
}

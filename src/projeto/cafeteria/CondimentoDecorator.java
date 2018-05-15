package projeto.cafeteria;

public abstract class CondimentoDecorator extends Produto {
protected Produto produto;
	
	public CondimentoDecorator(String detalhe, double preco) {
		this.detalhe = detalhe;
		this.preco = preco;
		
		//ATENCAO: a cada condimento adicionado, informo aos observadores que este condimento - this - esta sendo adicionado ao produto
		ObserverManager.getInstance().notifyObservers(this);
	}
	
	public abstract String getFullDescription();
	
	public String getDetalhes() {
		return this.detalhe;
	}
}

package dominio;

public class CarrinhoDeCompras {

	private double total;
	private Produto [] produtos = new Produto [10];
	
	
	

	

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public void adiciona(LivroFisico fisico) {

		System.out.println("adicionado: " + fisico);

		fisico.aplicaDescontoDe(0.05);

		total += fisico.getValor();
	}

	public void adiciona(Revista revista) {

		System.out.println("adicionado: " + revista);

		revista.aplicaDescontoDe(0.05);

		total += revista.getValor();
	}
             
	public void adiciona(Produto produto) {

		System.out.println("adicionado: " + produto);
		this.produtos[1] = produto;
		total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}

}
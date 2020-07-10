package dominio;

import java.util.ArrayList;

public class CarrinhoDeCompras {

	private double total;
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<>();
	}
	
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void remove(int posicao) {
		this.remove(posicao);
	}
	
	public ArrayList <Produto> getProdutos(){
		return produtos;
	}

	

	
	public double getTotal() {
		return total;
	}

}
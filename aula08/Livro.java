package dominio;

public abstract class Livro implements Produto {
	
	
	private String nome;
	private String descricao;
	protected double valor;
	private String isbn;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	private Autor autor;
	
	
	boolean temAutor() {
		return this.autor !=null;
	}
	
	
	
	void mostrarDetalhes() {
		System.out.println("Mostrar Livros");
		System.out.println("Nome: "+nome);
		System.out.println("Descrição: "+descricao);
		System.out.println("Valor: "+valor);
		System.out.println("Isbn: "+isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("--");
	}
	//overloaded - sobrecarga não tenham a mesma quantidade de parâmetro.
	public Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "000.000";
	}
	
	public Livro() {
		this.isbn="000.000";
	}
	
	
	
	void adcionaValor(double valor) {
		this.valor = valor;
	}
	
	
	
}

package dominio;

public class LivroFisico extends Livro implements Promocional  {
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpress�o() {
		return this.getValor() * 0.05;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto no LivroFisico");
		return true;
	}
	
}
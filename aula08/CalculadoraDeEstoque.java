package dominio;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		
		double livroJava = 150.90;
		double livroTDD = 59.90;
		
		double soma = livroJava + livroTDD;
		
			
		
			
		
	
		double soma1 = 0;
		
		
		
		for(int contador1 = 0; contador1 < 35; contador1++) {
				
			soma1 += 59.90;
		}
		
		for(int i = 0; i <= 10; i++) {
			if(i == 7) {
				break;
			}
			System.out.println(i);
		}
		

      System.out.println("O total em estoque � " + soma1);
		
		
		
		if (soma < 150) {
			System.out.println("Seu estoque est� muito baixo " );
		}else if (soma >= 2000) {
			System.out.println("O total em estoque � muito alto! ");
		}else {
			System.out.println("Seu estoque est� bom" );
		}
	
	
	
}
}
package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "sapato";
		p1.preco = 100.99;
		p1.desconto = 0.24;

		
		var p2 = new Produto();
		p2.nome = "camisa";
		p2.preco = 140.99;
		p2.desconto = 0.13;
		
		
		System.out.println(p1.nome );
		System.out.println(p2.nome);

		double precoFinalp1 = p1.precoComDesconto();
		System.out.println(precoFinalp1);
		
		double precoFinalp2 = p2.precoComDesconto(0.10);
		System.out.println(precoFinalp2);

		
		double mediaTotal = ( precoFinalp1 + precoFinalp2 ) / 2;
		System.out.printf( "Média total: R$%.2f ", mediaTotal);
		
	}

}
 
package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("sapato", 100.99);
		
		var p2 = new Produto();
		p2.nome = "camisa";
		p2.preco = 100.99;
		
		System.out.println(p1.nome );
		System.out.println(p2.nome);

		double precoFinalp1 = p1.precoComDesconto();
		System.out.println(precoFinalp1);
		
		double precoFinalp2 = p2.precoComDescontoNatal();
		System.out.println(precoFinalp2);
		
		
		Produto.desconto = .70;
		double precoFinalp23 = p2.precoComDesconto();
		System.out.println(precoFinalp23);

		
		double mediaTotal = ( precoFinalp1 + precoFinalp2 ) / 2;
		System.out.printf( "Média total: R$%.2f ", mediaTotal);
		
	}

}
 
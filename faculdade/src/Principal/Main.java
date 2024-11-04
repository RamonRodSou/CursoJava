package Principal;

public class Main {

    public static int fase = 0;

    public static void main(String[] args) {

        // // Questões

        // System.out.println("Questao 01");
        // int x = 1; // 2, 3, 4
        // do {
        //     if (x % 5 == 0)
        //         continue;
        //     if (x % 4 == 0) // parou pq 4 % 4 == 0 zero
        //         break;

        //     System.out.println(x++ + " "); // imprimi 1 e soma + 2 , imprime 2 e soma +1 = 3, imprime 3 e soma +1 = 4
        // } while (x <= 7); // ok

        // // vai imprimir 1, 2, 3

        // System.out.println("--------------------------------");
        // System.out.println("Questao 02");

        // fase = 5;
        // for (int i = fase; i > 1; i--) {
        //     i++;
        //     System.out.println(fase);
        // }

        Venda venda = new Venda();

        // Adiciona alguns produtos
        venda.adicionarProduto(new Produto("Produto1", 400, 1));
        venda.adicionarProduto(new Produto("Produto2", 400, 1));
        venda.adicionarProduto(new Produto("Produto3", 201, 1));
    
        // Calcula e exibe o total da venda
        double total = venda.calcularTotal();
        System.out.println("Total da venda com desconto: R$ " + total);

    }

}

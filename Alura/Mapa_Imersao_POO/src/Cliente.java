import javax.swing.*;

public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private double renda;

    public void cadastrarCliente(){
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente"));
        this.nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente"));
        this.renda = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda do cliente"));
    }

    public String imprimirResumoCliente(){
        String msg = "Id: " + this.id + "\n";
        msg +="Nome " + this.nome + "\n";
        msg +="Idade " + this.idade + "\n";
        msg +="Renda " + this.renda + "\n";
        return msg;
    }

    public double getRenda(){
        return this.renda;
    }
}

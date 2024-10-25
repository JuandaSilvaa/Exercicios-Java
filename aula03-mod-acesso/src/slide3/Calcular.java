package slide3;

import javax.swing.JOptionPane;

public class Calcular {

    public static void main(String[] args) {
        int resposta;

        do {
            String descricao;
            Double valor;
            int quantidade;

            descricao = JOptionPane.showInputDialog("Digite o nome do produto:");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));

            Produto produto = new Produto(descricao, valor, quantidade);
            
            String mensagem = String.format("O ICMS sobre o produto %s é: R$%.2f%nO valor total sobre o produto %s é: R$%.2f%n",
                    produto.getDescricao(), produto.calcularIcms(), produto.getDescricao(), produto.calcularTotal());
            
            JOptionPane.showMessageDialog(null, mensagem);

            resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular outro produto?", "Continuar",
                    JOptionPane.YES_NO_OPTION);

        } while (resposta == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Programa encerrado." );
        
    }
}
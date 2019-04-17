import javax.swing.*;
import java.awt.*;

/**
 * 05 - Criar um algoritmo
 **/

public class GerenciarPedido {
    public static void main(String[] args) {
        // comentário
        String nome = JOptionPane.showInputDialog("Digite o nome de usuário:");
            // comentário
            if(nome.equals("Java")){

            // comentário
            Object[] lista = {
                    "101 - Cachorro Quente",
                    "102 - Bauru Simples",
                    "103 - Bauru Com Ovo",
                    "104 - CheeseBurguer",
                    "105 - Refrigerante"
            };

            // variáveis
            int addProduto = 1;
            double valorFinal = 0;
            String dsPedido = "";

            // comentário
            while(addProduto == 1){
                // montam a caixa de dialogo do item escolhido
                Object itemEscolhido = JOptionPane.showInputDialog(
                        null,
                        "Escolha um item",
                        "Seleção de Opções",
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        lista,
                        lista[0]);
                // faz uma verificação do item escolhido
                if(itemEscolhido != null){
                    try{
                        // comentário
                        System.out.println(itemEscolhido);

                        // comentário
                        String cod = itemEscolhido.toString().substring(0, 3);
                        String txQt = JOptionPane.showInputDialog("Digite a Quantidade");
                        int qt = Integer.parseInt(txQt);
                        double preco = 0;

                        // comentário
                        switch (cod){

                            case "100":
                                preco = 1.2;
                                break;

                            case "101":
                                preco = 1.3;
                                break;

                            case "102":
                                preco = 1.5;
                                break;

                            case "103":
                                preco = 1.2;
                                break;

                            case "104":
                                preco = 1.3;
                                break;

                            case "105":
                                preco = 1;
                                break;

                            default:
                                break;
                        }

                        // comentário
                        double total = preco * qt;
                        JOptionPane.showConfirmDialog(null, "Valor Total" + String.format("%.2f", total));

                    }catch(NumberFormatException e){
                        // comentário
                        JOptionPane.showMessageDialog(null, "Numero não Identificado.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            // comentário
            Object[] lsOpcao = {"Não", "Sim"};
            addProduto = JOptionPane.showOptionDialog(
                    null,
                    "Deseja registrar outro produto?",
                    "Continuar",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    lsOpcao,
                    lsOpcao[1]);
        }
    }
}

import javax.swing.*;

/**
 * 05 - Criar um algoritmo
 **/

public class GerenciarPedido {
    public static void main(String[] args) {
        // comentário
        Object[] lista = {
                "101 - Cachorro Quente",
                "102 - Bauru Simples",
                "103 - Bauru Com Ovo",
                "104 - CheeseBurguer",
                "105 - Refrigerante"
        };

        Object itemEscolhido = JOptionPane.showInputDialog(null," Escolha um item", "Seleção de Opções", JOptionPane.INFORMATION_MESSAGE, null, lista, lista[0]);
    }
}

package sistema;// comentário
import javax.swing.JOptionPane;

public class GerenciarConta extends Conta {

    public static void main(String[] args){
        // comentário
        Conta conta01 = new Conta();
        conta01.numero = 301;
        conta01.depositar(2000);
        conta01.nome = "Pedro";

        // comentário
        conta01.sacar(300);

        // comentário
        conta01.depositar(20);

        // comentário
        Object[] opcoes = {
                "Dados do sistema.Questao03" ,
                "Extrato",
                "Depositar",
                "Saldo",
                "Sacar",
        };

        // comentário
        int opcao = JOptionPane.showOptionDialog(null,"Escolha uma opção", "Operações Bancárias", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        // comentário
        if(opcao == 0){
            conta01.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
        }

        // comentário
        if(opcao ==1 ){
            String txValor = JOptionPane.showInputDialog("Digite o valor: ");
            double valor = Double.parseDouble(txValor);
            boolean sucesso = conta01.sacar(valor);
            if(sucesso){
                JOptionPane.showMessageDialog(null,"Saque realizado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente para saque");
            }
        }

        // comentário
        if (conta01.sacar(1800)){
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente para saque");
        }

        // comentário
        System.out.println("Nome: "+ conta01.nome + "\nSaldo: " + conta01.getSaldo());
    }
}

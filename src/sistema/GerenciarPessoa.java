package sistema;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.String;

public class GerenciarPessoa {

    public static void main(String[] args) throws ParseException {
        // método new é um construtor da classe 'sistema.Questao03'
        //sistema.Questao03 cliente = new sistema.Questao03(); -> método default sem parâmetros conforme declaração na classe sistema.Questao03

        // string que faz a leitura através de uma caixa de diálogo na tela
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        String renda = JOptionPane.showInputDialog("Digite a renda do cliente: ");
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do cliente: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // instancia o objeto da classe cliente e passa como parâmetros: nome, renda
        Cliente cliente = new Cliente(nome, Double.parseDouble(renda));

        // seta os valores de maneira fixa nos atributos da classe
        cliente.setCpf("043.254.691-09");
        cliente.setDataNascimento(sdf.parse(dataNascimento));
        cliente.setTelefone("(61) 9 8597-1259");
        cliente.setSexo("Masculino");

        // comentário
        Object[] opcaoSexo = {"Masculino" ,"Feminino"};
        Object sexo = JOptionPane.showInputDialog(
                null,
                "Qual o sexo",
                "Opções",
                JOptionPane.DEFAULT_OPTION,
                null,
                opcaoSexo,
                opcaoSexo[0],
                cliente.setSexo(opcaoSexo.toString().charAt(0)));

        // comentário
        System.out.println(cliente.getNome());

        // comentário
        GerenciarContaJO gerenciar = new GerenciarContaJO();
        gerenciar.usarConta(cliente);
    }
}

// comentário
public class GeradorCPF {
    // comentário
    public static int buscaDig(int dig, int[] cpf){
        // comentário
        int aux = 10 + dig;
        int soma = 0;

        // comentário
        for(int i = 0; i <= 8 + dig; i++){
            // comentário
            int mult = cpf[i] * aux;

            // comentário
            soma = soma + mult;
            System.out.println("pos " + i + " val " + cpf[i] + " mult " + aux + " = " + mult + " vlr soma " + soma);
            aux--;
        }
        // comentário
        int rest = soma % 11;
        System.out.println("resto: " + rest);

        // comentário
        if(rest < 2){
            return 0;
        }else {
            return 11 - rest;
        }
    }
    // comentário
    public static void main(String[] args){
        // comentário
        int[]cpf = new int[11];
        cpf[0] = 0;
        cpf[1] = 4;
        cpf[2] = 3;
        cpf[3] = 2;
        cpf[4] = 5;
        cpf[5] = 4;
        cpf[6] = 6;
        cpf[7] = 9;
        cpf[8] = 1;

        // comentário
        cpf[9] = buscaDig(0, cpf);
        System.out.println(cpf[9]);

        // comentário
        cpf[10] = buscaDig(1,cpf);
        System.out.println(cpf[10]);

        // comentário
        for(int i = 0; i < cpf.length; i++){
            System.out.print(cpf[i]);
            // desafio: incluir máscara na impressão do CPF ao buildar a classe
        }
    }
}

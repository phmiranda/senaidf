package atividades.exercicio04;// comentário

// comentário
import javax.swing.*;
import java.util.Random;

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

        // comentário
        Random aleatorio = new Random();

        // comentário
        for (int i = 0; i < 9; i++){
            cpf[i] = aleatorio.nextInt(10);
        }

        // comentário
        cpf[9] = buscaDig(0, cpf);
        System.out.println(cpf[9]);

        // comentário
        cpf[10] = buscaDig(1, cpf);
        System.out.println(cpf[10]);

        // comentário
        String txCpf = "";

        // comentário
        for (int i = 0; i < cpf.length; i++){
            System.out.print(cpf[i]);
            txCpf = txCpf + cpf[i];

            // comentário
            if (i == 2 || i ==5){
                System.out.print(".");
                txCpf += ".";
            }

            // comentário
            if (i == 8){
                System.out.print("-");
                txCpf += "-";
            }
        }
        // comentário
        JOptionPane.showMessageDialog(null, txCpf);
    }
}

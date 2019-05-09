package atividades.exercicio04; /**
 * 01 - Escreva um algoritmo que vai ler N1 e N2 e o sistema vai escrever os números entre eles.
 */

// comentário
import java.util.Scanner;

// comentário
public class Verificador {
    public static void main(String[] args){
        // classe usada para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // pergunta qual o primeiro valor a ser digitado
        System.out.println("Digite o primeiro valor: \n");
        int N1 = scanner.nextInt();

        // pergunta qual o segundo valor a ser digitado
        System.out.println("Digite o segundo valor: \n");
        int N2 = scanner.nextInt();
        scanner.nextLine();

        // percorre o intervalo dos valores de N1 e N2
        for(int i = N1; i <= N2; i++){
            System.out.println(i);
        }
    }
}

/**
 * 01 - Escreva um algoritmo que vai ler N1 e N2 e o sistema vai escrever os números entre eles.
 */

// comentário
import java.util.Scanner;

// comentário
public class Exercicio01 {
    public static void main(String[] args){
        // comentário
        Scanner scanner = new Scanner(System.in);

        // declaração das variáveis a serem lidas
        int N1,N2, soma, i;

        // comentário
        System.out.printf("Digite o primeiro valor: \n");
        N1 = scanner.nextInt();

        System.out.printf("Digite o segundo valor: \n");
        N2 = scanner.nextInt();

        // percorre o intervalo dos valores de N1 e N2
        for(i = N1; N2 < i; i++){
            soma = i;
            System.out.println(soma);
        }
        // comentário
        //System.out.printf("O valor digitado é: %2d \n", N1);
        //System.out.printf("O valor digitado é: %2d \n", N2);

    }
}

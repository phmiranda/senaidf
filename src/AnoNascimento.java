// comentário
import java.util.Scanner;

// comentário
public class AnoNascimento {
    // comentário
    public static void main(String[] args){
        // tratamento de exceção na execução condicional
        try{
            System.out.println("Digite seu nome:");
            Scanner scanner = new Scanner(System.in);
            String pessoa = scanner.nextLine();
            System.out.println("Boa noite:" + pessoa);
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            System.out.println("Já fez aniversário? Sim [0] ou Não [1]");
            int aniversario = scanner.nextInt();

            // verifica a condição da variável 'aniversario'
            if(aniversario == 0 || aniversario == 1){
                int ano = 0;
                //int ano = 2019 - idade - aniversario;
                if( aniversario == 0){
                    ano = 2019 - idade - 1;
                }else{
                    ano = 2019 - idade;
                }
                System.out.println("Eu sei que você nasceu em: " + ano);
                if (1994 < ano){
                    System.out.println("O Brasil já era tetra campeão!");
                }else{
                    if(1994 == ano){
                        System.out.println("Você deu sorte para o Brasil na Copa do Mundo!");
                    }else{
                        System.out.println("o Brasil ainda não era tetra campeão!");
                    }
                }
            }else{
                System.out.println("Não foi possível computador o ano do nascimento!");
            }
        }catch(Exception e){
            System.out.println("Erro na entrada de dados");
        }
    }
}

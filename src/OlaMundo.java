import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args){
        try{
            System.out.println("Digite seu nome: ");
            Scanner scanner = new Scanner(System.in);

            String pessoa = new scanner.nextLine();
            System.out.println("Boa noite:" + pessoa);
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Já fez aniversário ?");
        }catch(Exception e){
            String msg = "Erro de entrada de dados...";
            System.out.println(msg);
        }
    }
}

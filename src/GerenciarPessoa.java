public class GerenciarPessoa {

    public static void main(String[] args){
        // método new é um construtor da classe 'Cliente'
        //Cliente cliente = new Cliente(); -> método default sem parâmetros conforme declaração na classe Cliente
        Cliente cliente = new Cliente("Pedro", 4000);
        cliente.setCpf("04325469109");
        cliente.setIdade(25);
        cliente.setTelefone("61985971259");
        cliente.setSexo("Masculino");
    }
}

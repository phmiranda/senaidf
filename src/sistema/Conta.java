package sistema;

public class Conta {
    // comentário
    public int numero;
    public String nome;
    private Cliente cliente;
    private double saldo;
    private String extrato = "";

    // comentário


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // comentário
    public double getSaldo(){
        return this.saldo;
    }

    // comentário
    public String getExtrato(){
        return this.extrato;
    }

    // comentário
    public boolean depositar(double valor){
        extrato += "C - " + valor;
        saldo += valor;
        return true;
    }

    // comentário
    public boolean sacar(double valor){
        // verifica se o valor solicitador é maior que o saldo disponível
        if(valor > saldo){
            return false;
        }
        extrato += "D - " + valor;
        saldo -= valor;
        return true;
    }
}

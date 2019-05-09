package sistema;

public class Cliente extends Pessoa {
    // comentário
    private double renda;
    private String telefone;

    // comentário
    Cliente(String nome, double renda){
        setNome(nome);
        setRenda(renda);
    }

    // comentário
    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

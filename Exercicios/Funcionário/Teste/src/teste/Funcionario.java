package teste;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario() {
        this.setNome("Felipe");
        this.setCpf("111111111-11");
        this.setSalario(1000);
    }
    
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}

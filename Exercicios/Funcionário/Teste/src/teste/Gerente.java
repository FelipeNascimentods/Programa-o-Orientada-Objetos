package teste;

public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    @Override
    public double getBonificacao() {
        return (this.salario * 0.15) + this.getSalario();
    }
    
    
}

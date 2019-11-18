package encp.Emcapsulamento;
/**
 *
 * @author felip
 */
public class Teste {
    public static void main(String[] args) {
        Funcionario novo;
        novo = new Funcionario();
        
        /*
         *novo.nome = "Felipe Dos Santos";
         *novo.salario = 5000;
         */
        
        novo.setNome("Felipe Dos Santos");
        novo.setSalario(10000);
        
        /*
         *System.out.println("Nome: " + novo.nome);
         *System.out.println("Salario: R$ " + novo.salario);
         */
        
        System.out.println("Nome: " + novo.getNome());
        System.out.println("Salario: R$ " + novo.getSalario());
    }
}

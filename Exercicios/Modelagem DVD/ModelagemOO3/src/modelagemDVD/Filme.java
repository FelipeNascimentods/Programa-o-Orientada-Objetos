package modelagemDVD;

/**
 *
 * @author felip
 */
public class Filme {
    private String nome;
    private String categoria;
    private double duracao;
    
    public Filme(){
        nome = "Rei Leão";
        categoria = "Animação";
        duracao = 2.30;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public double getDuracao(){
        return this.duracao;
    }
}

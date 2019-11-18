package Classes;

public class Insecta extends Arthropoda{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nClasse Insecta");
    }
}

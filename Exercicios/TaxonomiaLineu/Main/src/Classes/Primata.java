package Classes;

public class Primata extends Mammalia{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nOrdem Primata");
    }
}

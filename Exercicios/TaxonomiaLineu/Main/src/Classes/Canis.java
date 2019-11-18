package Classes;

public class Canis extends Canidae{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nGênero Canis");
    }
}

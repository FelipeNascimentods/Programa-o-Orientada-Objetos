package Classes;

public class Musca extends Muscidae{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nGênero Musca");
    }
}

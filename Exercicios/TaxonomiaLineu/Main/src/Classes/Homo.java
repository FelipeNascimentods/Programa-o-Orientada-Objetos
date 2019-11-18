package Classes;

public class Homo extends Hominidae{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nGênero Homo");
    }
}

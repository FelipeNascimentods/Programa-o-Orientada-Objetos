package Classes;

public class Hominidae extends Primata{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nFamília Hominidae");
    }
}

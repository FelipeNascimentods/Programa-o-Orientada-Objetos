package Classes;

public class Muscidae extends Díptera{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nFamília Muscidae");
    }
}

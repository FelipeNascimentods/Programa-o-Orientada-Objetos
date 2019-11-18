package Classes;

public class Canidae extends Carnivora{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nFamília Canidae");
    }
}

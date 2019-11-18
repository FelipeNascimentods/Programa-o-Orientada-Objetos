package Classes;

public class Chordata extends Animalia{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nFilo Chordata");
    }
}

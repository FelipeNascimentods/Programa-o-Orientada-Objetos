package Classes;

public class Arthropoda extends Animalia{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nFilo Arthropoda");
    }
}

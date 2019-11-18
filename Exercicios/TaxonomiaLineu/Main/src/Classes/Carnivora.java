package Classes;

public class Carnivora extends Mammalia{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nOrdem Carnívora");
    }
}

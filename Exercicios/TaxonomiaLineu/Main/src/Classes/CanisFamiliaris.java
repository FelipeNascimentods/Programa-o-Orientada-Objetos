package Classes;

public class CanisFamiliaris extends Canis{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nEspécie Canis Familiaris");
    }
}

package Classes;

public class MuscaDomestica extends Musca{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nEspécie Musca Doméstica");
    }
}

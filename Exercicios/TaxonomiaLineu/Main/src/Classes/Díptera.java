package Classes;

public class Díptera extends Insecta{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nOrdem Díptera");
    }
}

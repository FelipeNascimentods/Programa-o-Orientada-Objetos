package Classes;

public class HomoSapiens extends Homo{
    @Override
    public String obterDescricao(){
        return (super.obterDescricao()+"\nEspécie Homo Sapiens");
    }
}

    package Classes;

    public class Mammalia extends Chordata{
        @Override
        public String obterDescricao(){
            return (super.obterDescricao()+"\nClasse Mammalia");
        }
    }

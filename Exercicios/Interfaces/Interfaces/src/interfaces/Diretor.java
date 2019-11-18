package interfaces;

public class Diretor extends Funcionario implements Autenticavel{
    private int senha;

    public Diretor(int senha) {
        this.setSenha(senha);
    }
    
    @Override
    public boolean autentica(int senha) {
        return this.getSenha() == senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
}

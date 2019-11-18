package interfaces;

public class Cliente implements Autenticavel{
    private int senha;

    public Cliente(int senha) {
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

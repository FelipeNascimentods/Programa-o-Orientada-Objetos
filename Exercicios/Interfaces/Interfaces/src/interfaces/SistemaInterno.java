package interfaces;

public class SistemaInterno {
    private int senha;
    
    public SistemaInterno() {
    
    }
    
    boolean login(Autenticavel a){
        return a.autentica(senha);
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}

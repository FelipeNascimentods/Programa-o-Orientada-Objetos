package interfaces;

public class Main {

    public static void main(String[] args) {
        Autenticavel gerente = new Gerente(10);
        Autenticavel diretor = new Diretor(11);
        Autenticavel cliente = new Cliente(12);
        
        SistemaInterno sistema = new SistemaInterno();
        
        sistema.login(diretor);
        sistema.setSenha(0);
    }
    
}

package main;

public class Professor {
    private int siape;
    private int qtdLivro;
    private Livro[] livros;
    
    // Métodos personalizados
    public void receberLivro(Livro livro){
        if((getQtdLivro()<=1) && (!livro.isEmprestado())){
            this.livros[getQtdLivro()] = livro;
            livro.setEmprestado(true);
            this.setQtdLivro(1);
        }
    }
    
    public void devolverLivro(String isbn){
        int i;
        for(i=0; i<getQtdLivro(); i++){
            if(livros[i].getISBN().equals(isbn)){
                livros[i].setEmprestado(false);
                this.setQtdLivro(-1);
                return;
            }
        }
    }
    
    // Métodos especiais
    public Professor() {
        this.setQtdLivro(0);
        this.livros = new Livro[1];
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public void setQtdLivro(int qtdLivro) {
        if((getQtdLivro()<1) && (getQtdLivro()>=0)){
            this.qtdLivro += qtdLivro;
        }
    }

    public int getSiape() {
        return siape;
    }

    public int getQtdLivro() {
        return qtdLivro;
    }
    
}
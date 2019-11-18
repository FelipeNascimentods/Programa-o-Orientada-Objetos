package main;

public class Aluno {
    private int matricula;
    private int qtdLivro;
    private Livro[] livros;

    // Métodos personalizados
    
    /*public void statusAluno(){
        System.out.println("----------------------------------------------------");
        System.out.println("Matricula: "+getMatricula());
        System.out.println("Quantidade de livros: "+getQtdLivro());
        int i;
        for(i=0; i<getQtdLivro(); i++){
            System.out.println("Livro: ");
            livros[i].statusLivro();
        }
        System.out.println("----------------------------------------------------");
    }*/
    
    public void receberLivro(Livro livro){
        if((getQtdLivro()<=2) && (!livro.isEmprestado())){
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
    public Aluno(int matricula) {
        this.setQtdLivro(0);
        this.livros = new Livro[2];
        this.setMatricula(matricula);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setQtdLivro(int qtdLivro) {
        this.qtdLivro += qtdLivro;
    }

    public int getQtdLivro() {
        return qtdLivro;
    }
    
    
}

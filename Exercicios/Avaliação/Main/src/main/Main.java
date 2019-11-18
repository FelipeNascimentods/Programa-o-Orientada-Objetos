package main;

public class Main {

    public static void main(String[] args) {
        Aluno aluno;
        Professor professor;
        Autor autor;
        Livro livro;
        
        autor = new Autor();
        autor.setNome("Felipe");
        autor.setSobrenome("Nascimento Dos Santos");
        autor.setData("15/12/1997");
        
        livro = new Livro("Linguagem de Programação", "TADSSAJ005", autor);
        
        aluno = new Aluno(12345);
        aluno.receberLivro(livro);
        System.out.println("----------------------------------------------------");
        System.out.println("Matricula: "+aluno.getMatricula());
        System.out.println("Quantidade de livros: "+aluno.getQtdLivro());
        System.out.println("Titulo: "+livro.getTitulo());
        System.out.println("ISBN: "+livro.getISBN());
        System.out.println("Emprestado: "+livro.isEmprestado());
        System.out.println("Autor: "+autor.getNome()+" "+autor.getSobrenome());
        System.out.println("----------------------------------------------------");
        //aluno.devolverLivro("TADSSAJ005");
      
    }
    
}

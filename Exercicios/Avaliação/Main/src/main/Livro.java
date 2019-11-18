package main;

public class Livro {
    private String titulo;
    private String ISBN;
    private boolean emprestado;
    private Autor autor;
    
    // Métodos personalizados
   /* public void statusLivro(){
        System.out.println("----------------------------------------------------");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("ISBN: "+getISBN());
        System.out.println("Emprestado: "+isEmprestado());
        System.out.println("Autor: "+autor.getNome()+" "+autor.getSobrenome());
        System.out.println("----------------------------------------------------"); 
    }*/

    // Métodos especiais
    public Livro(String titulo, String ISBN, Autor autor) {
        this.setTitulo(titulo);
        this.setISBN(ISBN);
        this.emprestado = false;
        this.autor = new Autor();
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
    
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    
}

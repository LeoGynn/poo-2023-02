public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    public Livro(String titulo, String autor, int ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", editora='" + editora + '\'' +
                '}';
    }
}

public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Pré-Escrita - Coleção Aprenda em Casa", "Vários Autores", 2015, "Todolivro");
        Livro livro2 = new Livro("Perigoso!", "Tim Warnes", 2014, "Ciranda Cultural");
        Livro livro3 = new Livro("O Show da Luna - Descobrindo os dinossauros", "Ciranda Cultural", 2018, "Ciranda Cultural");

        System.out.println("Livro 1:");
        System.out.println(livro1);
        System.out.println("\nLivro 2:");
        System.out.println(livro2);
        System.out.println("\nLivro 3:");
        System.out.println(livro3);
    }
}
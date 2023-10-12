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
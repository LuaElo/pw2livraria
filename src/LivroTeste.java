public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro( "J. R. Tolkien", 9.99);
        meuLivro.nome = "O Hobbit";
        meuLivro.paginas = 521;
        meuLivro.resumo = "bla ";
        meuLivro.autor = "J. R. Tolkien";

        Editora editora1 = new Editora();
       // editora1.nome = "Erika";
        editora1.email= "edErika@erika.com.br";
        meuLivro.editora = editora1;
        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("Dan Brown", 9.99);
        livroFavorito.nome = "O Código Da Vinci";
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;
        livroFavorito.autor = "Dan Brown";
        Editora editora2 = new Editora("Editora Erika");
        // editora1.nome = "Erika";
        editora1.email= "edErika@erika.com.br";
        meuLivro.editora = editora2;


        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}

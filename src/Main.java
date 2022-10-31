import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Livro l1 = new Livro("Codigo: 01", "Titulo: Livro 01", "Autor: Cesar", "Ano: 1919");
		Livro l2 = new Livro("Codigo: 02", "Titulo: Livro 02", "Autor: Augusto", "Ano: 1589");
		Livro l3 = new Livro("Codigo: 03", "Titulo: Livro 03", "Autor: Carlos", "Ano: 2489");
		Livro l4 = new Livro("Codigo: 04", "Titulo: Livro 04", "Autor: Antonieta", "Ano: 2584");
		Livro l5 = new Livro("Codigo: 05", "Titulo: Livro 05", "Autor: Augustinha", "Ano: 2135");
		Livro l6 = new Livro("Codigo: 06", "Titulo: Livro 06", "Autor: Carlita", "Ano: 1684"); 

		
		Pessoa aluno1 = new Pessoa("Matricula: 2214033", "Nome: Carlos Augusto", "e-mail: carlosaugusto@edu.unifor.br", "Telefone: (85)00000-0000",
				"Curso: Análise e Desenvolvimento de Sistemas", "Turno: Noite");
		List<Livro> livroALuno1 = new ArrayList<Livro>();
		livroALuno1.add(l1);
		
		Pessoa aluno2 = new Pessoa("Matricula: 2255044", "Nome: Hugo Robison", "e-mail: hugor@edu.unifor.br", "Telefone: (85)00000-0000",
				"Curso: Arquiteura e Urbanismo", "Turno: Noite");
		List<Livro> livroAluno2 = new ArrayList<Livro>();
		livroAluno2.add(l4);
		
		Pessoa professor = new Pessoa("Matricula: 2321265", "Nome: Antônio Cesar", "e-mail.antoniocesar@edu.unifor.br",
				"Telefone: (85)00000-0000", "Titulação: Doutorado");
		List<Livro> LivroProfessor = new ArrayList<Livro>();
		LivroProfessor.add(l5);
		LivroProfessor.add(l2);
		LivroProfessor.add(l6);
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setPessoa(aluno1);
		emprestimo.setListaLivro(livroALuno1);
		emprestimo.calcularPrazo();
		emprestimo.devolver(l1);
		emprestimo.mostrarLivros();
		System.out.println(emprestimo.pessoa.nome);
		
		System.out.println("*******");
		
		Emprestimo emprestimo2 = new Emprestimo();
		emprestimo2.setPessoa(aluno2);
		emprestimo2.setListaLivro(livroAluno2);
		emprestimo2.calcularPrazo();
		emprestimo2.devolver(l4);
		emprestimo2.mostrarLivros();
		System.out.println(emprestimo2.pessoa.nome);
		
		System.out.println("*******");
		
		Emprestimo emprestimo3 = new Emprestimo();
		emprestimo3.setPessoa(professor);
		emprestimo3.setListaLivro(LivroProfessor);
		emprestimo3.calcularPrazo();
		emprestimo3.devolver(l5);
		emprestimo3.mostrarLivros();
		System.out.println(emprestimo3.pessoa.nome);
	}
}

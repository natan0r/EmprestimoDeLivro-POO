import java.util.List;

public class Emprestimo {
	
	private List<Livro> listaLivro;
	Pessoa pessoa;
	int prazo;
	boolean devolucao;
	
	// PESSOA
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	// LISTA LIVROS
	public List<Livro> getListaLivro() {
		return listaLivro;
	}

	public void setListaLivro(List<Livro> listaLivro) {
		if(
			(listaLivro.size() <= 3 && pessoa.curso != null && pessoa.turno != null) ||
			(listaLivro.size() <= 5 && pessoa.titulacao != null)
		) {
			this.listaLivro = listaLivro;
			
		} else {
			System.out.println("Você não pode levar esta quantidade de livros");
		}
		
	}

	public void calcularPrazo() {
		if(pessoa.titulacao != null) {
			prazo = 30;
			System.out.println("Prazo de devolução até 30 dias");
		} else if(pessoa.curso != null && pessoa.turno != null) {
			prazo = 10;
			System.out.println("Prazo de devolução até 10 dias");
		} else {
			System.out.println("Você não pode reservar este(s) livro(s)");
		}
	}
	
	public void devolver(Livro livro) {
		
		listaLivro.remove(livro);
		System.out.println("Livro devolvido");
		System.out.println("-----");
	}
	
	public void mostrarLivros() {
		for (Livro livro : listaLivro) {
			System.out.println(livro.titulo);
			System.out.println(livro.anoPublicação);
			System.out.println(livro.autor);
			System.out.println("---");
		}
	}
	
	public Emprestimo() {
		
	}
	
	/*
	public Emprestimo(Pessoa pessoa, int prazo, boolean devolucao) {
		super();
		this.pessoa = pessoa;
		this.prazo = prazo;
		this.devolucao = devolucao;
	}
	*/
	
}

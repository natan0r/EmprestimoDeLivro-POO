
public class Pessoa {
	
	String matricula;
	String nome;
	String email;
	String telefone;
	String curso;
	String turno;
	String titulacao;
	
	// MATRICULA
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	// NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// EMAIL
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//TELEFONE
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// CURSO
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	// TURNO
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	// TITULAÇÃO
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	// COSTRUTOR ALUNO
	public Pessoa(String matricula, String nome, String email, String telefone, String curso, String turno) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.curso = curso;
		this.turno = turno;
	}
	
	// CONSTRUTOR PROFESSOR
	public Pessoa(String matricula, String nome, String email, String telefone, String titulacao) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.titulacao = titulacao;
	}
}

package projetojava1.curso;

import java.util.Date;



public class Pessoa {
	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
	private Date dataNascimento;
	
	private Date dataCadastro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	

	public void setIdade(int idade) {
		this.idade = idade +1;
	}

	

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
	

}

package modelo;

public class Pessoa {

	String nome;
	String cpf;
	String endereco;
	String email;
	String telefone;
	
	
	public String getnome() {
		return nome;
	}

	public void setNome(String nome) {
		nome = nome;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
	
	public void ListaPessoa(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Email: " + this.email);
		System.out.println("Telefone: " + this.telefone);
		
	}
	
	
	
}

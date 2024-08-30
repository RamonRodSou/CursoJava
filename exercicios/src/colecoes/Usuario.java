package colecoes;

import java.util.Objects;

public class Usuario {
	
	String nome;
	
	public Usuario( String nome){
		this.nome = nome;
	}
	
	
	public String toString() {
		return "Meu nome é " + nome;
	}
	// Criar Hashcode Equals
	// Botao direito/sourcer/Generate HashCode Equals
	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
}



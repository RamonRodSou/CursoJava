package EqualsHashcode;

import java.util.Objects;

public class Usuarios {
	
	String nome;
	String email;
	
// Botao direito/ soucer/ Generate HashCode...
	
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}

}


//public boolean equals(Object objeto) {
	
//if( objeto instanceof Usuarios) {
		
//	Usuarios outro = (Usuarios)objeto;
//	boolean nomeIgual = outro.nome.equals(this.nome);
//	boolean emailIgual = outro.email.equals(this.email);
//	return nomeIgual && emailIgual;
//	}else {
//		return false;
//	}
//}

// O Hashcode será abordado em outra aula
//public int hashCode() {
//	return hashCode();
//}





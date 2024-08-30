package classe;

import java.util.HashSet;

import EqualsHashcode.Usuarios;
import colecoes.Usuario;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario ("Ramon"));
		usuarios.add(new Usuario ("Samara"));
		usuarios.add(new Usuario ("Antonio"));
		usuarios.add(new Usuario ("Eloisa"));
		
		boolean compara =  usuarios.contains((new Usuario ("Eloisa")));

		System.out.println(compara);
		
	}
}

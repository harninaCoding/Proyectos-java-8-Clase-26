import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	void test() {
		Usuario usuario=new Usuario("1", "Pancracio", (byte)0);
		System.out.println(usuario.toString());
	}

}

package nivel6;

public class Exercicio83 {
	public static void main(String[] args) {
		
		Container container = new Container();
		
		DependencyInjector dp = new DependencyInjector(container);
		
		UsuarioService userService = dp.criar(UsuarioService.class);
		
		userService.cadastrarUsuario();
		
	}
}

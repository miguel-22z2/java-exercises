package nivel6;

public class UsuarioService {
	
	private UsuarioRepository repository;
	
	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}
	
	public void cadastrarUsuario() {
		
		System.out.println("Cadastrando...");
		
		repository.salvar();
		
	}
	
}

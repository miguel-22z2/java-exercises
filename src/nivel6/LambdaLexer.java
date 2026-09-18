package nivel6;

import java.util.ArrayList;
import java.util.List;

public class LambdaLexer {
	
	public List<LambdaToken> analisar(String codigo) {
		
		 List<LambdaToken> tokens = new ArrayList<>();
		 
		 String[] partesCodigo = codigo.split(" ");
		 
		 if (partesCodigo[0].equals("print")) {
			 tokens.add(new LambdaToken(LambdaTipoToken.PRINT, "print"));
			 
			 String mensagem = codigo.substring(7);
			 
			 mensagem = mensagem.replaceAll("\"", "");
			 
			 tokens.add(new LambdaToken(LambdaTipoToken.STRING, mensagem));
		 } else if (partesCodigo[0].equals("sum")) {
			 tokens.add(new LambdaToken(LambdaTipoToken.SUM, "sum"));
			 
			 tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, partesCodigo[1]));
			 tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, partesCodigo[2]));
			 
		 }
		 
		 tokens.add(new LambdaToken(LambdaTipoToken.FIM, ""));
		 
		 return tokens;
	}

}

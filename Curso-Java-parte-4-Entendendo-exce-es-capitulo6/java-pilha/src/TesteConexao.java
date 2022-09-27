
public class TesteConexao {

	public static void main(String[] args) {
		
		int a = 1;
		
		if (a > 0) {
			a++;
			System.out.println(a);
			++a;
			System.out.println(a);
		}
		
		
		
		
//		try (Conexao conexao = new Conexao() ) {
//			conexao.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		}
//		
		
		//-----------------------------
		
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		} finally {
			System.out.println("finally");
			if(con != null) {
				con.close();
			}
		}
		

	}

}

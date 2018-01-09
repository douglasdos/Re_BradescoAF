/*
 * Created on 31/05/2005
 */
package br.com.plusoft.csi.bradescoaf.constantes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

import br.com.plusoft.csi.adm.helper.PermissaoConst;

public class PermissaoEspec extends PermissaoConst {
	
	public static void generateSql() throws IOException {

		Vector sql = new Vector();
		
		
		
		String arquivo = ConstantesEspec.NOME_ARQUIVO_PERMISSOES_ESPEC;
		File file = new File(arquivo);
		
		if (file.exists()) {
			file.delete();
		}
		
		FileOutputStream foStream = new FileOutputStream(arquivo, true);
		for (int i = 0; i < sql.size(); i++) {
			String comando = (String)sql.get(i) + "\n";
			foStream.write(comando.getBytes());
		}
		
		foStream.flush();      
		foStream.close();
		
		System.out.println("Arquivo gerado com sucesso (" + arquivo + ")");
	}
	
	public static void main(String args[])throws IOException{
		generateSql();
	}
}
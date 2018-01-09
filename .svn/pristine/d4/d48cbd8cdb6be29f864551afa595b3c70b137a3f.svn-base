package br.com.plusoft.csi.espec.plugin;

import br.com.plusoft.csi.bradescoaf.constantes.PermissaoEspec;
import br.com.plusoft.fw.log.Log;

import com.plusoft.plugin.interfaces.PlusoftPluginValidator;

public class ValidatorPlugin implements PlusoftPluginValidator {

	public void validatePlugin() throws NoClassDefFoundError{
		try{
			PermissaoEspec perm = new PermissaoEspec();
			Log.log(this.getClass(), Log.INFOPLUS, "Espec Bradesco Afinidade Validado!");
		}catch (Exception e){
			throw new NoClassDefFoundError("");
		}
	}
}

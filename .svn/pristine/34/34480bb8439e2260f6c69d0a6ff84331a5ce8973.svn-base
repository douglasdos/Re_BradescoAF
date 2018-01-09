//Chamado no onload da tela de endereço
function onloadEspec(){
	return true;
}

/*
 * Chamada criada para que seja possivel incluir uma validacao nas ações do endereço
 *
 * As ações podem ser:
 * incluir, editar, last, next, remover
 */
function validaAcaoEmail(acao, args) {
	try {
		if(acao=="incluir") {
			return validaIncluirEmail(args);
		} else if(acao=="editar") {
			return validaEditarEmail(args);
		} else if(acao=="remover") {
			return validaRemoverEmail(args);
		} else {
			return true;
		}
	} catch(e) {
		alert("Não foi possível efetuar a ação:\n\n"+e.message);
		return false;
	}
}

function validaIncluirEmail() {
	return true;
}

function validaEditarEmail() {
	return true;
}

function validaRemoverEmail() {
	return true;
}

//Chamado no onload da tela de endere�o
function onloadEspec(){
	return true;
}

/*
 * Chamada criada para que seja possivel incluir uma validacao nas a��es do endere�o
 *
 * As a��es podem ser:
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
		alert("N�o foi poss�vel efetuar a a��o:\n\n"+e.message);
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

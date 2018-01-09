//Chamado no onload da tela de endere�o
function onloadEspec(){
	return true;
}

/*
 * Chamada criada para que seja possivel incluir uma validacao nas a��es do telefone
 *
 * As a��es podem ser:
 * incluir, editar, last, next, remover
 */
function validaAcaoTelefone(acao, args) {
	try {
		if(acao=="incluir") {
			return validaIncluirTelefone(args);
		} else if(acao=="editar") {
			return validaEditarTelefone(args);
		} else if(acao=="remover") {
			return validaRemoverTelefone(args);
		} else {
			return true;
		}
	} catch(e) {
		alert("N�o foi poss�vel efetuar a a��o:\n\n"+e.message);
		return false;
	}
}

function validaIncluirTelefone(args) {
	return true;
}

function validaEditarTelefone(args) {
	return true;
}

function validaRemoverTelefone(args) {
	return true;
}

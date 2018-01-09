//Chamado no onload da tela de endereço
function onloadEspec(){
	return true;
}

/*
 * Chamada criada para que seja possivel incluir uma validacao nas ações do telefone
 *
 * As ações podem ser:
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
		alert("Não foi possível efetuar a ação:\n\n"+e.message);
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

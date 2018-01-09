/*
Este arquivo deve conter todos as funcoes para obtencao de informacoes dentro da aplicacao
*/

/**
Verifica se o funcionario tem permissao para acessar uma determinada funcionalidade
*/
function getPermissao(funcionalidade){
	
	try{
		if(window.top.ifrmPermissao!=undefined){		
			return window.top.ifrmPermissao.findPermissao(funcionalidade);
		}else if(window.top.window.dialogArguments.window.top.ifrmPermissao){
			return window.top.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
		}else if(window.top.window.dialogArguments.window.top.window.dialogArguments.window.top.ifrmPermissao != undefined){
			return window.top.window.dialogArguments.window.top.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
		}else{
			try{
				return window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
			}catch(e){
				try{
					return window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
				}catch(e){
					try{
						return window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
					}catch(e){
						try{
							return window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
						}catch(e){
							try{
								return window.dialogArguments.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
							}catch(e){
								try{
									return window.dialogArguments.window.dialogArgumentswindow.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
								}catch(e){
									try{
										return window.dialogArguments.window.dialogArguments.window.dialogArgumentswindow.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
									}catch(e){
										try{
											return window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArgumentswindow.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
										}catch(e){
											try{
												return window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArgumentswindow.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
											}catch(e){
												try{
													return window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArgumentswindow.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
												}catch(e){
													return window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArgumentswindow.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}catch(e){
		try{
			if(window.opener.window.top.window.dialogArguments.window.top.ifrmPermissao!=undefined){	
				return window.opener.window.top.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
			}
		}catch(e){
			try{
				if(window.opener.window.top.ifrmPermissao!=undefined){	
					return window.opener.window.top.ifrmPermissao.findPermissao(funcionalidade);
				}
			}catch(e){}	
		}
	}
}

function findPermissoesByFuncionalidade(funcionalidade){
	return window.top.ifrmPermissao.findPermissoesByFuncionalidade(funcionalidade);
}

/**
Desabilita objeto(s) imagem de acordo com a funcionalidade
*/
function setPermissaoImageDisable(funcionalidade, obj){	
	if(window.top.ifrmPermissao!=undefined){
		var temPermissao = window.top.ifrmPermissao.findPermissao(funcionalidade);
	}else{
		var temPermissao = window.top.window.dialogArguments.window.top.ifrmPermissao.findPermissao(funcionalidade);
	}
	
	if (!temPermissao){
		if (obj != undefined){
			//objeto unico
			if (obj.length == undefined){			
				obj.disabled=true;
				obj.className = 'geralImgDisable';
				obj.alt='';
			//array
			}else{
				for (var i = 0; i < obj.length; i++){
					obj[i].alt='';

					// jvarandas - Se for um TD só muda a cor e tira o click
					if(obj[i].nodeName != null && obj[i].nodeName !=undefined) {
						if(obj[i].nodeName == "TD") {
							obj[i].style.color = "#808080";
							obj[i].onclick = "";
							
							continue;
						}
					}
					obj[i].disabled=true;
					obj[i].className = 'geralImgDisable';
				}
			}
		}
	}
}

/**
Habilita objeto(s) imagem de acordo com a funcionalidade
*/
function setPermissaoImageEnable(funcionalidade, obj, alt){	
	var temPermissao = window.top.ifrmPermissao.findPermissao(funcionalidade);
	if (temPermissao){
		if (obj != undefined){
			//objeto unico
			if (obj.length == undefined){			
				obj.disabled=false;
				obj.className = 'geralCursoHand';
				obj.alt=alt;
			//array
			}else{
				for (var i = 0; i < obj.length; i++){
					obj[i].disabled=false;
					obj[i].className = 'geralCursoHand';
					obj[i].alt=alt;
				}
			}
		}
	}
}
// ------------------------------------------------------------------------------------------ //
// Acrescenta algumas propriedades aos controles:
// .Indice			: indica o índice na tela para o controle
// .IndiceAnterior	: indica o índice do controle anterior
// .IndicePosterior	: indica o índice para o controle posterior
// .Tam				: tamanho máximo para digitação
// .AutoSkip		: indica se pula para o próximo campo após completar o tamanho do campo
// .Tipo			: indica o tipo de dado
//						'D' -> só dígitos de 0(zero) a 9(nove)
//						'N' -> dígitos de 0(zero) a 9(nove), "."(ponto) e ","(vírgula)
//						'C' -> caracteres de 'a' até 'z' e de 'A' até 'Z'
//						outro -> qualquer caracter entre ascii 32 e ascii 127
// .Saltar			: (reservado) indica o momento de saltar de campo
// ------------------------------------------------------------------------------------------ //

// Carrega índices para o próximo controle e controle anterior

AlfaOK     = "AaBbCcÇçDdEeFfGgHhIiJjLlKkMmNnOoPpQqRrSsTtUuVvXxWwYyZz0123456789@#$*()/\!-_., ";
CodigoOK   = "@AaBbCcÇçDdEeFfGgHhIiJjLlKkMmNnOoPpQqRrSsTtUuVvXxWwYyZz0123456789._-";
NumeroOK   = "0123456789-.";
DataOK     = "0123456789/";

function InicializarIndices(doc)
{
	
	if (doc.CargaInicial==null)
	{
		doc.CargaInicial=false;		// Seta para só fazer uma vez por documento
		var ctrlAnterior=null;
		var IndAnt=0;
		for ( var i=0; i<doc.forms[0].elements.length;i++)
		{
			var e=doc.forms[0].elements[i];
			if ( e.type!="hidden" && e.type!="image" )		
			{
				if ( ctrlAnterior != null )
					ctrlAnterior.IndicePosterior=i;
				ctrlAnterior=e;
				e.Indice=i;
				e.IndiceAnterior=IndAnt;
			}
		}
		//if ( ctrlAnterior!=null )
		//{
		//	ctrlAnterior.IndicePosterior=i-1;
		//}
	}
}

// Colocar o foco em determinado campo
function SetarFoco(ind, doc){
	
	InicializarIndices(doc);
	
	if ( isNaN(ind) && doc.forms[0].elements[ind].type!="hidden" && doc.forms[0].elements[ind].enabled ){
		
		doc.forms[0].elements[ind].focus();
	}
	else{
		
		for (;ind < doc.forms[0].elements.length; ind++){
			
			if (doc.forms[0].elements[ind].type != "hidden" )
				break;
		}
		
		if(ind < doc.forms[0].elements.length && !doc.forms[0].elements[ind].disabled ){
			doc.forms[0].elements[ind].focus();
		}
	}
}

// Limpar o conteúdo do(s) campo(s)
function LimparCampo ( ind, doc )
	// Para -1, limpa todos os elementos
	{
	if (isNaN(ind))			// Limpa pelo nome
		doc.forms[0].elements[ind].value="";
	else if (ind != -1 )	// Limpa o elemento "ind" ( só considera "text" e "password" )
		for ( var i=ind; i < doc.forms[0].elements.length;i++ )
			if ( doc.forms[0].elements[i].type=="text" || doc.forms[0].elements[i].type=="password")		// Só limpa campo "text"
				{
				doc.forms[0].elements[i].value="";
				break;
				}
	else					// Limpa todos os elementos "text" e "password"
		for ( var i=0; i < doc.forms[0].elements.length; i++ )
			if ( doc.forms[0].elements[i].type=="text" || doc.forms[0].elements[i].type=="password" )
				doc.forms[0].elements[i].value="";
		
	}

// Verificar qual navegador
function QualNavegador() 
{
	var s = navigator.appName;
	if ( s == "Microsoft Internet Explorer" )
		return "IE";
	else if ( s == "Netscape" )
		return "NE";
	else
		return "";
}

// Verificar qual a versão do navegador
function QualVersao()
{
	var s = navigator.appVersion;
	if ( QualNavegador() == "IE" )
	{
		var i = s.search("MSIE");
		s = s.substring(i + 5);
	//	i = s.search(".");
		return parseFloat(s.substring(0, 3));
	//	return parseFloat(s.substring(0, i + 1));
	}
	else if ( QualNavegador() == "NE" )
		return parseInt(s.substring(0,1));
	else
		return 0;
}


// Critica se os campos estão preenchidos
function Critica_Formulario(Tela) {
	deuErro = Valida_Campo(Tela);
	if  (deuErro == false)
		return true;
	alert (deuErro);
	return false;
}

// Critica apenas os formatos dos campos
function Critica_Formato(Tela) {
	deuErro = Valida_Formato(Tela);
	if  (deuErro == false)
		return true;
	alert (deuErro);
	return false;
}

// Setar o evento
function SetarEvento(ctrl, Tipo)
{	
	// Filtra navegadores conhecidos	
	var s = QualNavegador();
	if ( s.length==0 )
		return;
	if ( s=="IE" && QualVersao() < 5 )
		return;
	if ( s=="NE" && QualVersao() < 4 )
		return;
	
	if (ctrl.onkeypress==null)
	{				
		//if (AutoSkip==null)
		AutoSkip=true;
		if (Tipo!=null)
			Tipo.toUpperCase();		
		ctrl.Tam = ctrl.maxLength;
		ctrl.Tipo=Tipo;
		ctrl.AutoSkip=true;
		ctrl.Saltar=false;
		InicializarIndices(ctrl.document);		
		ctrl.onkeypress=new function() { ValidarTecla(event); };
		if (QualNavegador()=="IE" && QualVersao()>4)
			ctrl.onkeyup=SaltarCampo;
	}
}

function SaltarCampo(ctrl)
{
	if (ctrl==null)
		ctrl=this;
	if ( ctrl.AutoSkip && ctrl.Saltar)
		if (ctrl.Saltar)
		{
			ctrl.Saltar=false;
			if ( ctrl.IndicePosterior != null )
				SetarFoco(ctrl.IndicePosterior);
				
				
		}
}

function ValidaTipoFor(ctrl){

	obj=ctrl.value;
	ctrl.value="";

	for(var i=0;i<obj.length;i++){
		c=obj.substring(i,i+1);
		if ( Number(c)>=0 && Number(c)<=9 ){
			ctrl.value=ctrl.value+c;
		}
	}

	return ctrl;
}

function ValidaTipo(ctrl, ntipo, evnt){

	var tk;
    var c;
	// Recebe a tela pressionada
	tk = ( (QualNavegador()=="IE") ? evnt.keyCode : evnt.which);
		
	if(tk == 8 || tk == 9 || tk == 46 || tk == 0 || tk==36 || tk==35 || tk==38 || tk==39 || tk==40 || tk==37){
		return true;
	}
	
    c=String.fromCharCode(tk);
	c=c.toUpperCase();

	switch ( ntipo )
	{

	case "D":
		if ( (c<"0" || c>"9") )
			return false;
        if ((ctrl.value.length == 2) || (ctrl.value.length == 5)){
            ctrl.value += "/"; 
		     return false;
		}
		break;

	case "N":
	//	if ( c<"0" || c>"9" ){if(tk == 9 || tk == 8 || tk == 0){
		if((!((tk >= 96 && tk <= 105) || (tk >= 48 && tk <= 57))) || tk == 13 || evnt.shiftKey){
			(QualNavegador()=="IE") ? evnt.returnValue=null : evnt.returnValue=null;
			return false;
		}
		break;
		
	case "C":
	     //Caso for Enter retorna false
	     if(!Critica_Caracter(c, ctrl)){
			return false;
		 }
		 
		 break;
		 
	case "A":
		if ((c<"A" || c>"Z") && (c<"0" || c>"9"))
			return false;
		break;
	default:
		break;
	}
}

// Fazer o salto de campo
function ValidarTecla (evnt)
{

	var tk;
    var c;
	// Recebe a tela pressionada
	tk = ( (QualNavegador()=="IE") ? evnt.keyCode : evnt.which);
    c=String.fromCharCode(tk);
	c=c.toUpperCase();
	
	// -- Este trecho faz com que o <Enter> tenha a função de <Tab>, mas acho inviável, pois não é possível
	//       colocar o foco em campos do Tipo "image", e, neste caso, nunca seria possível fazer a submissão
	//       do formulário
	// if ( tk == 13 )
	// {
	//	this.Saltar=true;
	//	SaltarCampo(this);
	//	return false;
	// }
	
	// Checa se for a tecla ENTER, caso for, retorna false.
    if(QualNavegador()== "IE" && evnt.keyCode == 13){
		return false;
    }
    else if(QualNavegador() != "IE" && evnt.which == 13){
		return false;
    }
	
	// Só aceita teclas alfanuméricas. Não aceita teclas de controle
    if ( tk < 32 )
		return true;
	if ( tk > 127 && tk!=231 && tk!=199) // tecla ç e Ç
		return false;

	switch ( this.Tipo )
	{

/* Esta função foi alterada para fornecer suporte ao Perfil....agora "N" suporta os caracteres '.'
	case "N":
		if ( c<"0" || c>"9" )
			return false;
		break;
*/
	case "D":
		if ( (c<"0" || c>"9") )
			return false;
		if ((this.value.length+1 == 2) || (this.value.length+1 == 5)){
		     this.value += c + "/"; 
		     return false;
		}
		break;
	case "N":
		if ( (c<"0" || c>"9") && (c!="." && c!="," && c!="-") )
			return false;
		if ( (c==",") && ((this.value.search(",")>-1) || (this.value.length==0)) )
			return false;
		if ( (c==".") && (this.value.length==0) )
			return false;
		if ( (c=="-") && (this.value.length!=0) )
			return false;
	/**
	 * Essa função foi alterada para funcionar com o PERFIL. As funcionalidades foram trocadas de "A" ou "C"
	 */
	case "C":
	     //Caso for Enter retorna false
	     if(!Critica_Caracter(c, this)){
			return false;
		 }
		 
		 break;

	/**
	 * Criada para validar CodigoOK, é caracter com menos silabas. E de Especiais.
	 */
	case "E":
	     //Caso for Enter retorna false
	     if(!Critica_Caracter_Especial(c, this)){
			return false;
		 }
		 break;
		 
	case "A":
		if (c!="." && (c<"A" || c>"Z") && (c<"0" || c>"9"))
			return false;
		break;
	default:
		break;
	}

	this.Saltar=(this.value.length==this.Tam-1);
	if ( ((QualNavegador()=="IE") && QualVersao()<5) || (QualNavegador()!="IE") )
		SaltarCampo(this);

	return true;
}
    function Critica_Data(Data_Informada, Formato)
	   {
        checkStr  = Data_Informada;
        diaStr    = "";
        mesStr    = "";
        anoStr    = "";
        ch        = "";
        Barra     = 0;
        Resto     = 0;
        i         = 0;
        j         = 0;
        anoStr    = 0;
        mesStr    = 0;
        diaStr    = 0;

        if  (Data_Informada == null)
            {
             return(false);
            }

        if  (checkStr.length < 10)
            {
             return(false);
            }

        for (i = 0;  i < checkStr.length;  i++)
            {
             ch = checkStr.charAt(i);
             for (j = 0;  j < DataOK.length;  j++)
                 if  (ch == DataOK.charAt(j))
                     break;
                 if  (j == DataOK.length)
                     {
                      return(false);
                     }
                 if  (ch == '/')
                     {
                      Barra++;
                     }
            }

        if  (Barra != 2)
            {
             return(false);
            }

        diaStr = checkStr.substring(0, 2);
        mesStr = checkStr.substring(3, 5);
        anoStr = checkStr.substring(6, 10);

        if  (diaStr.indexOf('/', 0) != -1 || 
             mesStr.indexOf('/', 0) != -1 ||
             anoStr.indexOf('/', 0) != -1)
            {
             return(false);
            }

        if  (diaStr == 0 ||
             mesStr == 0)
            {
             return(false);
            }  

        if  (mesStr > 12)
            {
             return(false);
            }

        if  (mesStr == 1 ||
             mesStr == 3 ||
             mesStr == 5 ||
             mesStr == 7 ||
             mesStr == 8 ||
             mesStr == 10 ||
             mesStr == 12)
             if  (diaStr > 31)
                 {
                  return(false);
                 }

        if  (mesStr == 4 ||
             mesStr == 6 ||
             mesStr == 9 ||
             mesStr == 11) 
             if  (diaStr > 30)
                 {
                  return(false);
                 }

        if  (mesStr == 02)
            {
             Resto   = anoStr % 4;
             if  (Resto > 0)
                 if  (diaStr > 28)  
                     {
                      return(false); 
                     }
                 else
                     {
                      return(true);
                     } 
             else
             if  (diaStr > 29)
                 {
                  return(false);
                 }
            }
            
           if (anoStr < 1800)
           			return false;
           
           return(true);
       } //Fim do Critica_Data

    function Critica_Numero(Numero_Informado, Tamanho, Decimais, Sinal)
	   {
        if  (Numero_Informado == null)
            {
             return(true);
            }

        checkStr    = Numero_Informado;
        ch          = "";
        i           = 0;
        j           = 0;
        Virgula     = 0;
        Negativo    = 0;
        NroInteiros = 0;
        NroDecimais = 0;

        for (i = 0;  i < checkStr.length;  i++)
            {
             ch = checkStr.charAt(i);
             for (j = 0;  j < NumeroOK.length;  j++)
                 if  (ch == NumeroOK.charAt(j))
                      break;
                 if  (j == NumeroOK.length)
                     {
                      return(false);
                     }

                 if  (ch == '.')
                     {
                      if  (Decimais == 0)
                          {
                           return(false);
                          }
                      if  (Virgula > 0)
                          {
                           return(false);
                          } 
                      Virgula++;
                     }

                 if  (ch == '-')
                     {
                      if  (!Sinal)
                          {
                           return(false);
                          }
                      if  (NroInteiros > 0 || NroDecimais > 0)
                          {
                           return(false);
                          }
                      if  (Negativo > 0)
                          {
                           return(false);
                          }
                      Negativo++;
                     }

                 if  (ch != '.' & ch != '-')  
                      if  (Virgula == 0)
                          {
                           NroInteiros++;
                          }
                      else
                          {
                           NroDecimais++;
                          }
            } //Fim do For

        if  (NroInteiros > (Tamanho - Decimais))
            {
             return(false);
            }

        if  (NroDecimais > Decimais)
            {
             return(false);
            }

        if  (NroInteiros == 0 & NroDecimais == 0)
            {
             return(false);
            } 

        return(true); 
       } //Fim do Critica_Numero


    function Critica_Caracter(Char, Conteudo){
// trocado o search pelo indexOf, estava com erro o search com coracteres +, \ etc...
    	if  (AlfaOK.indexOf(Char) == -1){
			return false;
		}

		/* Esta função foi alterada para funcionar com o PERFIL 
		if(Char == ' '){ 
			if(Conteudo.value.length == 0){
		    	return false;
		    }		         
		     
		    CharAnt = Conteudo.value;
			 
			if  (CharAnt.substring(Conteudo.value.length-1, Conteudo.value.length) == ' '){
				return false;
			}
		}
		*/
  		return(true); 
       
    } //Fim do Critica_Caracter

    function Critica_Caracter_Especial(Char, Conteudo){
    	if  (CodigoOK.indexOf(Char) == -1){
			return false;
		}
  		return(true); 
       
    } //Fim do Critica_Caracter_Especial
	   
    function Critica_Branco(Campo_Informado)
	   {
		CharAnt = Campo_Informado;
		if  (CharAnt.substring(CharAnt.length-1, CharAnt.length) == ' ')
		     return false;
        return(true); 
       } //Fim do Critica_Alfa
       
    function Valida_Campo(Tela) {
    	return Valida_Campo_Formato(Tela, true);
    }
    
    function Valida_Formato(Tela) {
    	return Valida_Campo_Formato(Tela, false);
    }
    

    /*
    Valida os formatos dos campos.
    Se obrigatoriedade == true, tb valida se o campo é obrigatório
    */
    function Valida_Campo_Formato(Tela, obrigatoriedade)
	   {
	   	   
        for (x = 0;  x < Tela.elements.length;  x++)
		    {
			 Campo = Tela.elements[x]
			 if  (Campo.type == "text" || Campo.type=="password" || Campo.type=="textarea")
			     {				
				  if  (Campo.getAttribute("critica").substring(0, 1) == "O" && obrigatoriedade)
				      {
					   if  (Campo.value == "")
					       {
					        Mostra_Foco(Campo);
				            return("O campo " + Campo.displayName + " é obrigatório.")
				           }
				      }
				  if  (Campo.value != "")
				      {
					   if  (Campo.getAttribute("critica").substring(1, 2) == "A") {				   
                            if  (!Critica_Branco(Campo.value)) {
				                 Campo.value = Campo.value.substring(0, Campo.value.length-1);
                            } 
						}
						// Crítica de tamanho de campo	
						if (Campo.maxlength != null && Campo.value.length > Campo.maxlength) {
							Mostra_Foco(Campo);
							return("O campo " + Campo.displayName + " deve conter, no máximo, " + Campo.maxlength + " caracteres.\n\nAtualmente ele contém " + Campo.value.length + ".");
						}
						
					   /** 
					    * Esta função foi alterada para não tratar formato no campo crítica, segue abaixo a linha anterior do codigo alterado
					    * if  (Campo.getAttribute("critica").substring(1, 2) == "N" || Campo.getAttribute("critica").substring(1, 2) == "P")
					    */   
					   if  (Campo.getAttribute("critica").substring(1, 2) == "P")
					       {
						    Tamanho  = Campo.getAttribute("critica").substring(2, 4)
							Decimais = Campo.getAttribute("critica").substring(4, 6)
							Sinal    = (Campo.getAttribute("critica").substring(1, 2) == "P") ? false : true;
							if  (!Critica_Numero(Campo.value, Tamanho, Decimais, Sinal))
							    {
								 Mostra_Foco(Campo);
								 return("O numero " + Campo.displayName + " está no formato errado.")
								}
						   }
					   if  (Campo.getAttribute("critica").substring(1, 2) == "D")
					       {					     
						    if  (!Critica_Data(Campo.value))
							    {
								 Mostra_Foco(Campo);
								 return("O campo " + Campo.displayName + " está no formato errado.")
								}
						   } 
					  }
				 }
				 
				if((Campo.type == "checkbox" || Campo.type == "radio") && (doc.all[Campo.id] != null)){
				 	
					if  (Campo.getAttribute("critica") != null && Campo.getAttribute("critica").substring(0, 1) == "O" && obrigatoriedade){
						checados = 0;	
						
						//Valdeci - mesmo não sendo uma array exibe mensagem de obrigatório
						if(doc.all[Campo.name].length == undefined){
							if(doc.all[Campo.name].checked == true)
							checados++;
						}else{
							for(i = 0; i< doc.all[Campo.name].length; i++){
								if(doc.all[Campo.name][i].checked == true)
								checados++;
							}
						}
						
						if  (checados <= 0){
							Mostra_Foco(Campo);
							return("É obrigatório existir pelo menos 1 registro em " + Campo.displayName);
						}
					}
				}
			}			
			return false; 
       } //Fim do Critica_Alfa
    
    // Crítica de tamanho de campo
    function Valida_Tamanho(Campo){
    	if (Campo.maxlength != null && Campo.value.length >= Campo.maxlength) {
			Mostra_Foco(Campo);
			return false;
		}		
    }   
       
       function Mostra_Foco(Campo)
       {
			if  (!Campo.disabled)
				{ 
				 Campo.focus();				 
				}			
				
			return;				
       } 
	
	
	//Function que confere os digitos verificadores do CNPJ
	function calcula(x, numero, soma)						
	{			
		//Faz a multiplicacao de cada um dos numeros armazenados no CNPJ 
		//por um outro numero, neste caso, "multi".																
		//A multiplicação deve comecar pela ultima posição do CNPJ até a primeira.			
		//O valor de multi deve ser iniciado em x e ir aumentando até 9, depois retorna a 2.	
		multi = x;
		for (i=11; i >= 0; i--)
		{
			soma += ((parseInt(numero.substring(i, i+1))) * multi);											
			multi = (multi <= 8) ? multi+1 : 2;  			
		}
										
		//O resultado obtido a partir da soma acima deve deve ser	
		//dividido por 11 e armazenado na variavel result1 apenas 
		//o valor inteiro da divisão.
		result1 = parseInt(soma/11);					
									
		//A variavel result1 deve ser multiplicada pelo numero 11.
		//O resultado é armazenado na variável result2.												
		result2 = result1*11;		
					
		//Result3 recebera o valor da subtracao da variável soma pela variável result2.									
		result3 = soma-result2;
										
		//Result4 é o resultado da subtração de 11 pelo valor de result3.																						
		result4 = 11-result3;
										
		//Se o resultado de result4 for igual a 10 entao o valor de DC será igual a 0,
		//caso contrario, se o valor de result4 for igual ou menor que 9,
		//o valor de DC sera igual a result4.										
		return (result4 >= 10) ? 0 : result4;		
	}
	
	// Function que troca 2 imagens
	function Troca_Imagem (objeto, arquivo) {
		objeto.src = arquivo;
	}
		
	
	//Function que consiste o CNPJ!
	function Valida_CNPJ(CNPJ)
	{
		valorCNPJ = CNPJ.value;

		if (valorCNPJ.length != 14 || valorCNPJ == "00000000000000")
		{
			alert ('CNPJ Incorreto.');			
			CNPJ.select();
			return(false);
		}
				
		//Calculo do primeiro digito controlador		
		DV1 = calcula(2, valorCNPJ.substring(0, 12), 0);
		
		//Calculo do segundo digito controlador		
		soma = DV1 * 2;
		DV2 = calcula(3, valorCNPJ.substring(0, 12), soma);
				
		//Comparacao do numero controlador							
		if (valorCNPJ.substring(12, 13) != DV1 || valorCNPJ.substring(13, 14) != DV2)
		{
			alert ('CNPJ Incorreto.');			
			CNPJ.select();
			return(false);
		}
		else
			return(true);
	}	
	
	/*
	Habilita ou Desabilita um campo
	
	@param campo Objeto campo (acompanhado do Form pai)
	@param acao true: habilitado - false: desabilitado
	*/
	function habilitaDesabilitaCampo(campo, acao) {
		if	(campo.length > 1 && campo.type != 'text'){
			for(i = 0; i < campo.length; i++){
				campo[i].disabled = !acao;
			}
		}
		else
			campo.disabled = !acao;
	}
	
	/*
	Mostra ou esconde uma div
	
	@param div Objeto div
	@param acao true: Mostra - false: Esconde
	*/
	function habilitaDesabilitaDiv(div, acao) {
		div.style.visibility = (acao) ? "visible" : "hidden";
	}	
	
	/*
	 * Checa se uma DataInicial é menor que uma DataFinal. A função recebe duas datas 
	 * no padrão brasileiro e do tipo String. Retorna boolean onde true indica que a 
	 * DataInicial é menor que a DataFinal e false caso o contrário.
	*/
	function validaData(dtInicial, dtFinal){
		
		result = true;
		
		inicialDay = parseInt(dtInicial.substring(0, 2));
		inicialMonth = parseInt(dtInicial.substring(3, 5));
		inicialYear = parseInt(dtInicial.substring(6, 10));
		
		finalDay = parseInt(dtFinal.substring(0, 2));
		finalMonth = parseInt(dtFinal.substring(3, 5));
		finalYear = parseInt(dtFinal.substring(6, 10));
		
		if(inicialYear < finalYear){	
			return true;
		}
		else if(inicialYear > finalYear){
			return false;
		}
		else if(inicialYear == finalYear && inicialMonth < finalMonth){
			return true;
		}
		else if(inicialYear == finalYear && inicialMonth > finalMonth){
			return false;
		}
		else if(inicialYear == finalYear && inicialMonth == finalMonth && inicialDay < finalDay){
			return true;
		}
		else if(inicialYear == finalYear && inicialMonth == finalMonth && inicialDay > finalDay){
			return false;
		}
		else {
			return true;
		}
	}
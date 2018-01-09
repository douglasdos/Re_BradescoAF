/*
Conjunto de funcoes javascript para acesso ao applet de cti
@author Henrique
@since 12/05/2005
*/

/**
Metodo que devera ser executado quando o usuario for se conectar no cti server
*/
function connect(objNames, objValues) {

	var url = "";
	url= url + "evento=connect";
	if (objNames!=null && objNames!=undefined){
		for(var i = 0; i < objNames.length; i++){
			url= url + "&" + objNames[i] +  "=" + objValues[i];
		}
	}

	ctiApplet.setHabilitaLog(true);
	ctiApplet.callMethodByJavaScript(url);

}


/**
Evento recebido quando o usuario tenta se conectar na aplicacao
*/
function onConnect(obj){
	onConnectImpl(obj);
}

/**
Metodo que devera ser executado para se desconectar com o servidor
*/
function disconnect(){
	var url = "";
	url= url + "evento=disconnect";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento recebido quando o usuario executa o metodo de desconeccao
*/
function onDisconnect(obj){
	onDisconnectImpl(obj);
}

/**
Metodo executado quando o usuario tentar se logar na aplicacao
*/
function login(objNames, objValues) {

	var url = "";
	url= url + "evento=login";
	if (objNames!=null && objNames!=undefined){
		for(var i = 0; i < objNames.length; i++){
			url= url + "&" + objNames[i] +  "=" + objValues[i];
		}
	}

	ctiApplet.callMethodByJavaScript(url);

}

/**
Evento executado quando o usuario se logar
*/
function onLogin(obj){
	onLoginImpl(obj);	
}

/**
Metodo executado quando o usuario tentar se deslogar da aplicacao
*/
function logout(){
	var url = "";
	url= url + "evento=logout";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario se deslogar na aplicacao
*/
function onLogout(obj){
	onLogoutImpl(obj);	
}

/**
Metodo executado quando o usuario tentar ficar disponivel no cti
*/
function ready(){
	var url = "";
	url= url + "evento=ready";
	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo ready na aplicacao
*/
function onReady(obj){
	onReadImpl(obj);
}

/**
Metodo executado quando o usuario tentar ficar indisponivel no cti
*/
function notReady(reason){
	var url = "";
	url= url + "evento=notReady&reason=" + reason;

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo notReady na aplicacao
*/
function onNotReady(obj){
	onNotReadyImpl(obj);
}

/**
Metodo executado quando o usuario desejar saber quais sao os recursos habilitados para  cti
*/
function getCtiResources(){
	var url = "";
	url= url + "evento=getCtiResources";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo getCtiResources
*/
function onGetCtiResources(obj){
	alert('onGetCtiResources');
}

/**
Metodo executado quando o usuario desejar cancelar o acw
*/
function cancelACW(){
	var url = "";
	url= url + "evento=cancelACW";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo cancelACW
*/
function onCancelACW(obj){
	alert('onCancelACW');
}

/**
Metodo executado quando o usuario desejar discar para um ramal ou para um telefone
*/
function makeCall(phone){
	var url = "";
	url= url + "evento=makeCall&phone=" + phone;

	ctiApplet.callMethodByJavaScript(url);	
}

/**
Evento executado quando o usuario executar o metodo makeCall
*/
function onMakeCall(obj){
	onMakeCallImpl(obj);
	getStatus();
}

/**
Metodo executado quando o usuario desejar desejar consultar um supervisor
*/
function consult(phone, grupo){
	var url = "";
	url= url + "evento=consult&phone="+phone + "&grupo=" + grupo;

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo consult
*/
function onConsult(obj){
	onConsultImpl(obj);
}

/**
Metodo executado quando o usuario desejar desejar cancelar uma consulta feita
*/
function cancelConsult(){
	var url = "";
	url= url + "evento=cancelConsult";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo cancelConsult
*/
function onCancelConsult(obj){
	alert('onCancelConsult');
}

/**
Metodo executado quando o telefone estiver tocando e o usuario desejar atender a ligacao
*/
function answer(){
	var url = "";
	url= url + "evento=answer";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo answer
*/
function onAnswer(obj){
	alert('onAnswer');
}

/**
Evento executado quando o cti enviar o comando de telefone tocando
*/
function onRinging(obj){
	onRingingImpl(obj);
}

/**
Metodo executado quando o usuario desejar tranferir a ligacao para um outro ramal
*/
function transfer(vName,vVal){
	var url = "";
	var i = 0;
	url= url + "evento=tranfer";
	while(vName[i] != undefined){
		url= url + "&" + vName[i] + "=" + vVal[i];	
		i++;		
	}
	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo transfer
*/
function onTransfer(obj){
	onTransferImpl(obj);
}

/**
Metodo executado quando o usuario desejar enviar uma mensagem via chat
*/
function chatSend(message,IDChat){
	var url = "";
	url= url + "evento=chatSend";
	url= url + "&chatMess=" + ctiApplet.encode(message);
	url= url + "&cIDChat=" + IDChat;	

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo chatSend
*/
function onChatSend(obj){

}

/**
Evento executado quando o cti enviar uma mensagem para o operador
*/
function onChatReceive(obj){

	var IDchat = obj.get("IDchat");
	IDchat = ctiApplet.decode(IDchat);	

	var mensagem = obj.get("chatMess");
	mensagem = ctiApplet.decode(mensagem);	

	var nick = obj.get("chatNick");
	nick = ctiApplet.decode(nick);	

	var newMsg = obj.get("chatNewMsg");
	newMsg = ctiApplet.decode(newMsg);	
	
	var email = obj.get("chatEMail");
	email = ctiApplet.decode(email);	

	var Fname = obj.get("chatFirstName");
	Fname = ctiApplet.decode(Fname);	

	var Lname = obj.get("chatLastName");
	Lname = ctiApplet.decode(Lname);	

	var nomeCompleto = Fname + " " + Lname;

	
	chatMessageReceive(IDchat,mensagem,nick,email,nomeCompleto,newMsg);
}

/**
Metodo executado quando o usuario desejar enviar uma mensagem via email
*/
function emailSend(from, to, cc, subject, body){
	var url = "";
	url= url + "evento=emailSend";
	url= url + "&emailFrom=" + ctiApplet.encode(from);
	url= url + "&emailTo=" + ctiApplet.encode(to);
	url= url + "&emailCc=" + ctiApplet.encode(cc);
	url= url + "&emailSubject=" + ctiApplet.encode(subject);
	url= url + "&emailBody=" + ctiApplet.encode(body);

	ctiApplet.callMethodByJavaScript(url);
	
	url = null;
}

/**
Evento executado quando o usuario executar o metodo emailSend
*/
function onEmailSend(obj){
	alert('onEmailSend');
}

/**
Evento executado quando o cti enviar uma mensagem de email para o operador
*/
function onEmailReceive(obj){
	var from = obj.get("emailFrom");
	from = ctiApplet.decode(from);	
	
	var to = obj.get("emailTo");
	to = ctiApplet.decode(to);	

	var cc = obj.get("emailCc");
	cc = ctiApplet.decode(cc);	

	var subject = obj.get("emailSubject");
	subject = ctiApplet.decode(subject);	

	var body = obj.get("emailBody");
	body = ctiApplet.decode(body);	

	var date = obj.get("dateSent");
	date = ctiApplet.decode(date);	

	var user = obj.get("userName");
	user = ctiApplet.decode(user);	

	var anexos = obj.get("emailAnexos");
	anexos = ctiApplet.decode(anexos);
	
	var others = obj.get("others");
	others = ctiApplet.decode(others);
	
	
	emailMessageReceive(from, to, cc, subject, body, date, user, anexos);
}

/**
Metodo executado quando o usuario desejar saber qual e o status do mesmo no cti
*/
function getStatus(){
	var url = "";
	url= url + "evento=getStatus";
	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo getStatus
*/
function onGetStatus(obj){
	var status = obj.get("status");
	status = ctiApplet.decode(status);	
	onGetStatusImpl(status);
}

/**
Metodo executado quando o usuario desejar deixar a ligacao muda
*/
function mute(){
	var url = "";
	url= url + "evento=mute";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo mute
*/
function onMute(obj){
	onMuteImpl(obj);
}

/**
Metodo executado quando o usuario desejar deixar a ligacao nao muda
*/
function notMute(){
	var url = "";
	url= url + "evento=notMute";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo notMute
*/
function onNotMute(obj){
	onNotMuteImpl();
}

/**
Metodo executado quando o usuario desejar desligar a ligacao
*/
function drop(cDesc,IDChat){
	var url = "";
	url= url + "evento=drop";
	url= url + "&cTipo=" + cDesc;	
	if(cDesc = "C"){
		url= url + "&cIDChat=" + IDChat;
	}
	
	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario executar o metodo drop
*/
function onDrop(obj){
	onDropImpl(obj);
}


/**
Evento executado quando der algum erro no cti
*/
function onError(obj){
	
	var erro = obj.get("erro");
	erro = ctiApplet.decode(erro);	
	onErrorImpl(erro);
}


/**
Metodo executado quando o ususario solicitar a lista de pessoas logadas
*/
function getUsers(){
	var url = "";
	url= url + "evento=getUsers";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario solicitar a lista de pessoas logadas
*/
function onGetUsers(obj){
	onGetUsersImpl(obj);
}

/**
Metodo executado quando o usuario solicitar que o cliente fique em espera
*/
function hold(){
	var url = "";
	url= url + "evento=hold";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario solicitar que o cliente fique em espera
*/
function onHold(obj){
	onHoldImpl(obj);
}

/**
Metodo executado quando o usuario solicitar que o cliente nao fique mais em espera
*/
function notHold(){
	var url = "";
	url= url + "evento=notHold";

	ctiApplet.callMethodByJavaScript(url);
}

/**
Evento executado quando o usuario solicitar que o cliente nao fique mais em espera
*/
function onNotHold(obj){
	onNotHoldImpl(obj);
}

function scheduling(idTpLog, dtAgendamento, hrAgendamento) {

	var url = "";
	url= url + "evento=scheduling";
	url= url + "&idTpLog=" + idTpLog;
	url= url + "&dtAgendamento=" + dtAgendamento;
	url= url + "&hrAgendamento=" + hrAgendamento;

	ctiApplet.callMethodByJavaScript(url);


}

function onScheduling(obj) {
	
}

function callResult(idTpResultado) {

	var url = "";
	url= url + "evento=callResult";
	url= url + "&idTpResultado=" + idTpResultado;

	ctiApplet.callMethodByJavaScript(url);

}


function onCallResult(obj) {
	alert(obj);	
	onCallResultImpl(obj);
}

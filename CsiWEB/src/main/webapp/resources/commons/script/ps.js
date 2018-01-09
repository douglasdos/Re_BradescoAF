// JS VERS�O 2.0 - JS E CSS TEM QUE SER A MESMA VERS�O
// SCRIPT DE NAVEGA��O DE ABAS
;(function() {
  $( 'document' ).ready( function() {
    $( '.tabs' ).psTabs();
    $( 'nav > ul > li:first-child > a' ).click();
  });
})();
(function ( $ ) {

    $.fn.psTabs = function() {

        var $obj = this;

        this.find( '[data-content]' ).hide();

        // Para marca��o dos elementos UL
        if( this.find( 'ul[data-tabs]' ).length ) {

            this.find( 'ul[data-tabs]' ).attr( 'data-tab' ) ?
                $( '#' + this.find( 'ul[data-tabs]' ).attr( 'data-tab' ) ).show() :
                $( '#' + this.find( 'ul[data-tabs] li' ).eq(0).attr( 'data-target' ) ).show();

            this.find( 'ul[data-tabs] > li' ).click( function( e ) {

                var $element = $( e.target ).attr( 'data-target' ) ? $( e.target ) : $( e.target ).parent(),
                    target = $element.attr( 'data-target' );

                $( '.tab-active' )
                  .removeClass( 'tab-active' );
                $element.addClass( 'tab-active' );

                $obj.find( '[data-content]' ).hide();
                $( '#' + target ).show();

            });

        } 
        return $obj;
    };

})(jQuery);
// FIM SCRIPT DE NAVEGA��O DE ABAS
// INSERI COR DE FUNDO NO CABE�ALHO DA LISTA
$('<div class="header-list"></div>').insertBefore(".list");

// AJUSTA AUTOMATICAMENTE OS BOT�ES DE CONNECT E DISASSOCIATE
$(".inline.connect-disassociate").each( function() {
		// VERIFICA A TAG PESQUISADA ATUAL PELO EACH()
		// PEGA O ID DO CAMPO ATUAL
		campo_atual = $(this).attr("id");
		// PEGA O HEIGHT DO CAMPO ATUAL
		height_campo_atual = $( "#"+campo_atual+" fieldset" ).css("height");
		// PEGA O HEIGHT DO CAMPO ATUAL SEM O PX PRA FAZER A DIVIS�O
		height_campo_atual_sem_px = height_campo_atual.replace("px","");
		// SETA O VALOR PRO SPAN
		$("#"+campo_atual+" > span").css("margin-top",height_campo_atual_sem_px/2-20+"px");
	} ) ;

// AQUI INSERE NO SELECT O -- SELECIONE UMA OP��O -- QUE � O PADR�O PLUSOFT
$( "select").append(
    $("<option></option>").val("").html("-- Selecione uma op��o --").addClass( 'capitalize')
);

$( ".disabled").prop("disabled","disabled");
// SCRIPT PRA FECHAR JANELA PRO BOT�O QUE USA .OUT
$( ".out" ).click(function() {
  window.close();
})
// T�TULO DEFAULT
// lixeira.gif
$( ".lixeira" ).attr({
  title: "Excluir",
  alt: "Excluir"
});

// lixeira18x18.gif
$( ".lixeira18x18" ).attr({
  title: "Excluir",
  alt: "Excluir"
});

// new.gif
$( ".new" ).attr({
  title: "Novo",
  alt: "Novo"
});

// gravar.gif
$( ".gravar" ).attr({
  title: "Gravar",
  alt: "Gravar"
});


// cancelar.gif
$( ".cancelar" ).attr({
  title: "Cancelar",
  alt: "Cancelar"
});

// calendar.gif
$( ".calendar" ).attr({
  title: "Calend�rio",
  alt: "Calend�rio"
});

// lupaPesq.gif
$( ".lupaPesq" ).attr({
  title: "Pesquisar",
  alt: "Pesquisar"
});

// lupa.gif
$( ".lupa" ).attr({
  title: "Pesquisar",
  alt: "Pesquisar"
});

// setaTop.gif
$( ".setaTop" ).attr({
  title: "Contrair Filtros",
  alt: "Contrair Filtros"
});

// setaBottom.gif
$( ".setaBottom" ).attr({
  title: "Expandir Filtros",
  alt: "Expandir Filtros"
});

// setaDown.gif
$( ".setaDown" ).attr({
  title: "Aplicar Filtro",
  alt: "Aplicar Filtro"
});


// out.gif
$( ".out" ).attr({
  title: "Sair",
  alt: "Sair"
});

// setaRight.gif
$( ".setaRight,.connect" ).attr({
  title: "Associar",
  alt: "Associar"
});

// setaLeft.gif
$( ".setaLeft,.disassociate" ).attr({
  title: "Desassociar",
  alt: "Desassociar"
});

// binoculo.gif
$( ".binoculo" ).attr({
  title: "Visualizar",
  alt: "Visualizar"
});

// confirmaEdicao.gif
$( ".confirmaEdicao" ).attr({
  title: "Confirmar Edi��o",
  alt: "Confirmar Edi��o"
});

// bt_selecionar_sim.gif
$( ".bt_selecionar_sim,.marcar-todos" ).attr({
  title: "Marcar Todos",
  alt: "Marcar Todos"
});

// bt_selecionar_nao.gif
$( ".bt_selecionar_nao,.desmarcar-todos" ).attr({
  title: "Desmarcar Todos",
  alt: "Desmarcar Todos"
});

// IN�CIO SCRIPTS ESPEC�FICOS PRA PAGINA��O
// setaDown.gif
$( ".pagination > .setaDown" ).attr({
  title: "Ir para p�gina selecionada",
  alt: "Ir para p�gina selecionada"
});

// setaLeft.gif
$( ".pagination > .setaLeft" ).attr({
  title: "Primeira p�gina",
  alt: "Primeira p�gina"
});

// voltar_unico.gif
$( ".pagination > .voltar_unico" ).attr({
  title: "P�gina anterior",
  alt: "P�gina anterior"
});

// avancar_unico.gif
$( ".pagination > .avancar_unico" ).attr({
  title: "Pr�xima p�gina",
  alt: "Pr�xima p�gina"
});

// avancar_unico.gif
$( ".pagination > .setaRight" ).attr({
  title: "�ltima p�gina",
  alt: "�ltima p�gina"
});

// naoIdentificado.gif
$( ".naoIdentificado" ).attr({
  title: "N�o Identificado",
  alt: "N�o Identificado"
});

// historico.gif
$( ".historico" ).attr({
  title: "�ltima pessoa atendida",
  alt: "�ltima pessoa atendida"
});

// Novo.gif
$( ".Novo" ).attr({
  title: "Nova Pessoa",
  alt: "Nova Pessoa"
});

// Novo.gif
$( ".atualizarDados" ).attr({
  title: "Lista de Equipamentos da Ap�lice",
  alt: "Lista de Equipamentos da Ap�lice"
});
// FIM SCRIPTS ESPEC�FICOS PRA PAGINA��O

// // EXTRAS
// AJUSTE DO SPAN DO TH QUANDO EST� CENTRALIZADO
var browser = "";
var nav = navigator.userAgent.toLowerCase();
    if(nav.indexOf("msie") != -1){
        browser = "msie";
    }else if(nav.indexOf("opera") != -1){
        browser = "opera";
    }else if(nav.indexOf("mozilla") != -1){
        if(nav.indexOf("firefox") != -1){
            browser = "firefox";
        }else if(nav.indexOf("firefox") != -1){
            browser = "mozilla";
        }else if(nav.indexOf("chrome") != -1){
            browser = "chrome";
        }
    }else{
      alert("Navegador desconhecido!");
    }

$(window).resize(function() {
  // c�digo que ser� executado quando o browser for redimensionado.
  $("th").each( function() {
    var seletor_span = "th."+$(this).attr("class") + " > span";  
    seletor_span = $(seletor_span).css("width", $(this).css("width") );

    if( $(this).css("text-align") === "center") {
     if( browser === "chrome" || browser === "firefox") {
        var largura_atual = $(this).css("width");
        largura_atual = largura_atual.replace("px","");
        var margin_left = "-"+largura_atual / 2 +"px";
        $(seletor_span).css("margin-left",margin_left);
      }
    }
  });

});

$("th").each( function() {
  var seletor_span = "th."+$(this).attr("class") + " > span";  
  seletor_span = $(seletor_span).css("width", $(this).css("width") );

  if( $(this).css("text-align") === "center") {
   if( browser === "chrome" || browser === "firefox") {
      var largura_atual = $(this).css("width");
      largura_atual = largura_atual.replace("px","");
      var margin_left = "-"+largura_atual / 2 +"px";
      $(seletor_span).css("margin-left",margin_left);
    }
  }
});

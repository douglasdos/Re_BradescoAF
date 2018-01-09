
   /**
   * 
   */
   function buttonPressed( obj, pressed )
   {
      try
      {
         if ( pressed )
         {
            obj.className = 'BUTTON_PRESSED';
         }
         else
         {
            obj.className = 'BUTTON';
         }
      }
      catch(Exception)
      {
         alert('Erro em buttonPressed()');
      }
   }

   /**
   * 
   */   
   function showItem( item )
   {
      item.style.display = "block";
   }

   /**
   *
   */
   function hideItem( item )
   {
      item.style.display = "none";
   } 
   
   function getNumberOnly( number )
   {
      var result = '';
      var num, i;
 
      for ( i = 0 ; i < number.length ; i++ )
      {
         try
         {
            var num = number.substring( i, i + 1 );
            if ( ! isNaN( num ) )
            {
               result += num;
            }
         }
         catch (exception)
         { }
      }
      return result;
   }
   
   function maskNumber( obj )
   {
      obj.value = getNumberOnly( obj.value );
   }
   
   
   function maskCPF( obj )
   {
      var value = obj.value;
      
      var result = '';
      
      var x = value;

      value = getNumberOnly( value );
     
      var len = value.length;
      // 999.999.999-99
      
      // 01234567890
      // 99999999999

      // part 1 
      if ( len == 0 )
      {
         return;
      }
           
      if ( len == 1 )
      {
         result += value.charAt( 0 );
      }
      else if ( len == 2 )
      {
         result += value.charAt( 0 ) + value.charAt( 1 );
      }
      else if ( len == 3 )
      {
         result += value.charAt( 0 ) + value.charAt( 1 ) + value.charAt( 2 );
      }
      else if ( len > 3 )
      {
         result += value.charAt( 0 ) + value.charAt( 1 ) + value.charAt( 2 );
         result += '.';
      }

      // part 2
      if ( len == 4 )
      {
         result += value.charAt( 3 );
      }
      else if ( len == 5 )
      {
         result += value.charAt( 3 ) + value.charAt( 4 );
      }
      else if ( len == 6 )
      {
         result += value.charAt( 3 ) + value.charAt( 4 ) + value.charAt( 5 );
      }
      else if ( len > 6 )
      {
         result += value.charAt( 3 ) + value.charAt( 4 ) + value.charAt( 5 );
         result += '.';
      }

      // part 3
      if ( len == 7 )
      {
         result += value.charAt( 6 );
      }
      else if ( len == 8 )
      {
         result += value.charAt( 6 ) + value.charAt( 7 );
      }
      else if ( len == 9 )
      {
         result += value.charAt( 6 ) + value.charAt( 7 ) + value.charAt( 8 );
      }
      else if ( len > 9 )
      {
         result += value.charAt( 6 ) + value.charAt( 7 ) + value.charAt( 8 );
         result += '-';
      }

      // part 4
      if ( len == 10 )
      {
         result += value.charAt( 9 );
      }
      else if ( len > 10 )
      {
         result += value.charAt( 9 ) + value.charAt( 10 );
      }

      // excedente
      if ( len == 12 )
      {
         result += value.charAt( 11 );
      }
      else if ( len == 13 )
      {
         result += value.charAt( 11 ) + value.charAt( 12 );
      }
      else if ( len >= 14 )
      {
         result += value.charAt(11) + value.charAt( 12 ) + value.charAt( 13 );
      }

      obj.value = result;
   }
   
   //-----------------------------------------------
   //
   // Faz a checagem do CPF
   //
   //-----------------------------------------------

   function checkCPF(strNumber)
   {

      var a = "";
      var b = "";
      var c = "";
      var d = "";

      //Aqui eh retirado a mascara do cpf (com mascara: 123.456.789-01) 
      if ( strNumber != "" )
      {
         a   = strNumber.substring(0,3); 
         b   = strNumber.substring(4,7); 
         c   = strNumber.substring(8,11); 
         d   = strNumber.substring(12,15); 
         strNumber = a + b + c + d;
      }

      var result = true;
      var digit;
      var calc;
    
      strNumber = getNumber(strNumber);
      if (strNumber.length < 4) {
         result = false;
      }
    
      if (!parseInt(strNumber.substring(strNumber.length - 6 , strNumber.length)))
      {
         result = false;
      }
    
      digit = parseInt(strNumber.substring(strNumber.length-2, strNumber.length));
      number = strNumber.substring(0 , strNumber.length - 2);
    
      calc = parseInt(getCPFDigit(number));
    
      if ( digit != calc )
      {
         result = false;
      }
      return result;
   }

   function getNumber(strNumber)
   {
      var number;
      var strRetNumber="";
    
      for (var i=0 ; i < strNumber.length ; i++)
      {
         number = parseInt(strNumber.charAt(i));
         if ( number )
         {
            strRetNumber += strNumber.charAt(i)
         }
         else
         {
            if ( number == 0 )
            {
               strRetNumber += strNumber.charAt(i)
            }
         }
      }
      return strRetNumber;
   }
    
   function getCPFDigit(strNumber)
   {
      var i;
      var digit1;
      var digit2;
      var total;
      var result;
      
      strNumber = '000000000' + getNumber(strNumber)
      strNumber = strNumber.substring(strNumber.length - 9, strNumber.length)
    
      total=0
      for (i = 1 ; i < 10; i++) 
         total = total + strNumber.substring(i - 1 , i) * (11 - i);
    
      digit1 = total * 10 % 11;
      if (digit1 == 10)
      {
         digit1 = 0;
      }
    
      aux = digit1.toString(10);
      strNumber = strNumber + aux.substring(aux.length - 1 , aux.length);
    
      total=0;
    
      for (i = 1 ; i < 11 ; i++) 
         total = total + strNumber.substring(i - 1 , i) * (12 - i);
    
      digit2 = total * 10 % 11;
      if (digit2 == 10)
      {
         digit2 = 0;
      }
    
      aux = digit1 * 10 + digit2;
      caux = aux.toString(10);
      result = caux.substring(caux.length - 2 , caux.length);
    
      return result;
   }
   
   /**
   * Substitua tudos os caráteres com acentos por caráteres sem acentos.
   */
   function substituaAcento( value )
   {
      try
   	  {
   	     var value = value.toUpperCase();
   		
   		 value = value.replace( /Á/g, 'A' );
   		 value = value.replace( /É/g, 'E' );
	     value = value.replace( /Í/g, 'I' );
	     value = value.replace( /Ó/g, 'O' );
	     value = value.replace( /Ú/g, 'U' );
      
         value = value.replace( /À/g, 'A' );
         value = value.replace( /È/g, 'E' );
         value = value.replace( /Ì/g, 'I' );
         value = value.replace( /Ò/g, 'O' );
         value = value.replace( /Ù/g, 'U' );
      
         value = value.replace( /Â/g, 'A' );
         value = value.replace( /Ê/g, 'E' );
         value = value.replace( /Î/g, 'I' );
         value = value.replace( /Ô/g, 'O' );
         value = value.replace( /Û/g, 'U' );
         
         value = value.replace( /Ä/g, 'A' );
         value = value.replace( /Ë/g, 'E' );
         value = value.replace( /Ï/g, 'I' );
         value = value.replace( /Ö/g, 'O' );
         value = value.replace( /Ü/g, 'U' );
      
         value = value.replace( /Ã/g, 'A' );
         value = value.replace( /Õ/g, 'O' );
         value = value.replace( /Ñ/g, 'N' );
      
         value = value.replace( /Ç/g, 'C' );
   		
   		 return value;
   	  }
   	  catch ( Exception )
   	  {
         alert( 'Erro em utils.substituaAcento()' );			
   	  }
   }
   
   /*
   * Valida se o campo especificado somente tem um valor numerico.
   */
   function validaCampoNumerico( campo )
	{
		try
		{
		

			if (window.event == null)
			{
				return true;
			}

			var key = window.event.keyCode;
			
			var keyChar = String.fromCharCode(key);
		
			// Valida se o tecla é um cursor key
			if ( (key==null) || (key==0) || (key==8) || 
	 			  (key==9) || (key==13) || (key==27) )
	 		{
	 			event.returnValue = true;
	 		}
	 		else if ((("0123456789,").indexOf(keyChar) > -1))
	 		{
	 			event.returnValue =  true;
	 		}
	 		else
	 		{
	 			event.returnValue = false;
	 		}
	 	}
	 	catch ( Exception )
	 	{
	 		alert('Erro em Utils.validaCampoNumerico()' );
	 	}
	}

   /*
   * Valida se o campo especificado somente tem um valor numerico inteiro.
   */
   function validaCampoNumericoInteiro( campo )
	{
		try
		{
		

			if (window.event == null)
			{
				return true;
			}

			var key = window.event.keyCode;
			
			var keyChar = String.fromCharCode(key);
		
			// Valida se o tecla é um cursor key
			if ( (key==null) || (key==0) || (key==8) || 
	 			  (key==9) || (key==13) || (key==27) )
	 		{
	 			event.returnValue = true;
	 		}
	 		else if ((("0123456789").indexOf(keyChar) > -1))
	 		{
	 			event.returnValue =  true;
	 		}
	 		else
	 		{
	 			event.returnValue = false;
	 		}
	 	}
	 	catch ( Exception )
	 	{
	 		alert('Erro em Utils.validaCampoNumerico()' );
	 	}
	}
	
	//Esta rotina tem como objetivo tirar os espacos da String
	function trim(cStr){
		if (typeof(cStr) != "undefined"){
			var re = /^\s+/
			cStr = cStr.replace (re, "")
			re = /\s+$/
			cStr = cStr.replace (re, "")
			return cStr
		}
		else
			return ""
	}	
	
	//Esta rotina tem como objetivo alterar todas as ocorrencias de uma determinada string 
	function replaceAll(str, localizar, alterar) {
		var val = str;
		for (var i = 0; i < str.length; i++)
	  	val = val.replace(localizar, alterar);
		return val;
	}	


    /*
    * This function will not return until (at least)
    * the specified number of milliseconds have passed.
    * It uses a modal dialog.
    */
     function sleep(numberMillis) {
        var dialogScript = 'window.setTimeout(' +
           ' function () { window.close(); }, ' + numberMillis + ');';
        var result = window.showModalDialog(
           'javascript:document.writeln(' +
            '"<script>' + dialogScript + '<' + '/script>")');
     }	
     
     /**
     * Este metodo tem como objetivo validar se o email eh valido ou nao
     */
    function validaEmail(cEmail){
		if (cEmail.search(/\S/) != -1) {
			regExp = /[A-Za-z0-9_]+@[A-Za-z0-9_]{2,}\.[A-Za-z]{2,}/
				if (cEmail.length < 7 || cEmail.search(regExp) == -1){
				return false;
			}						
		}
	
		num1 = cEmail.indexOf("@");
		num2 = cEmail.lastIndexOf("@");
		if (num1 != num2){
			return false;
		}     
	
		return true;
	}  

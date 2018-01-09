   
   function strReplaceAll(str,strFind,strReplace)
   {
      var returnStr = str;
      var start = returnStr.indexOf(strFind);
      while (start>=0)
      {
         returnStr = returnStr.substring(0,start) + strReplace + returnStr.substring(start+strFind.length,returnStr.length);
         start = returnStr.indexOf(strFind,start+strReplace.length);
      }
      return returnStr;
   }
   
   function prepare( value, sep )
   {
      if ( sep == ',' )
      {
         value = strReplaceAll( value, '.', ',' );
      }
      else if ( sep == '.' )
      {
         value = strReplaceAll( value, ',', '.' );
      }
      
      return value;
      
   }
   
   function getFloatFromString(strNumber){
		return parseFloat(prepare(strNumber,"."));   
   }   

   function numberValidateWithSignal( obj, digits, dig1, dig2 )
   {
      var posValue = 0;
      var valueChar;
      var strRetNumber;
      
      var value = prepare( obj.value, dig2 );
      
      if ( value == '' )
      {
         return;
      }
      
      var part1, part2;
      
      var pos = value.lastIndexOf( dig2 );
      if ( pos == -1 )
      {
         part1 = value;
         part2 = '';
      }
      else
      {
         part1 = value.substring( 0, pos );
         part2 = value.substring( pos + 1, value.length );
      }
      
      part1 = getDigitsWithSignalOf( part1 );
      part2 = getDigitsOf( part2 );
      
      if ( digits == 0 )
      {
         strRetNumber = getDigitsOf( part1 );
      }
      else
      {
         
         if ( part2.length <= digits )
         {
            var len = digits - part2.length;
            for( pos = 0; pos < len; pos++ )
            {
               part2 = part2 + "0";
            }
         }
         else
         {
            part2 = part2.substring( 0, digits );
         }
   
         var size = part1.length;
         
         strRetNumber = "";
         
         for( pos = 0; pos < size; pos++)
         {
            valueChar = part1.charAt( part1.length - pos - 1 );
            
            if ( ( pos ) % 3 == 0 && ( pos ) > 0 )
            {
               strRetNumber = dig1 + strRetNumber;
            }
            strRetNumber = valueChar + strRetNumber;
         }
         
         if ( strRetNumber == '' )
         {
            strRetNumber = '0';
         }
         
         if ( digits > 0 )
         {
            strRetNumber = strRetNumber + dig2 + part2;
         }
      }
      
      obj.value = strRetNumber;
   }
   
   function numberValidate( obj, digits, dig1, dig2, evnt )
   {
      var posValue = 0;
      var valueChar;
      var strRetNumber;
      
		//Nao eh keypress
		if (evnt.keyCode != 0){			
			var caracter = String.fromCharCode(evnt.keyCode);				
			var isDigito = (caracter == dig1 || caracter == dig2);
			
		    if (((evnt.keyCode < 48 && !isDigito) || (evnt.keyCode > 57 && !isDigito)) && evnt.keyCode != 8){				
		        evnt.returnValue = null;
		        return false;
			}
			
		}

      var value = prepare( obj.value, dig2 );
      
      if ( value == '' )
      {
         return true;
      }
      
      var part1, part2;
      
      var pos = value.lastIndexOf( dig2 );
      if ( pos == -1 )
      {
         part1 = value;
         part2 = '';
      }
      else
      {
         part1 = value.substring( 0, pos );
         part2 = value.substring( pos + 1, value.length );
      }
      
      part1 = getDigitsOf( part1 );
      part2 = getDigitsOf( part2 );
      
      if ( digits == 0 )
      {
         strRetNumber = getDigitsOf( part1 );
      }
      else
      {
         
         if ( part2.length <= digits )
         {
            var len = digits - part2.length;
            for( pos = 0; pos < len; pos++ )
            {
               part2 = part2 + "0";
            }
         }
         else
         {
            part2 = part2.substring( 0, digits );
         }
   
         var size = part1.length;
         
         strRetNumber = "";
         
         for( pos = 0; pos < size; pos++)
         {
            valueChar = part1.charAt( part1.length - pos - 1 );
            
            if ( ( pos ) % 3 == 0 && ( pos ) > 0 )
            {
               strRetNumber = dig1 + strRetNumber;
            }
            strRetNumber = valueChar + strRetNumber;
         }
         
         if ( strRetNumber == '' )
         {
            strRetNumber = '0';
         }
         
         if ( digits > 0 )
         {
            strRetNumber = strRetNumber + dig2 + part2;
         }
      }
      
      obj.value = strRetNumber;
   }

   function getDigitsOf(strNumber)
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

   function getDigitsWithSignalOf(strNumber)
   {
      var number;
      var strRetNumber="";
      var signal = "";

      if ( strNumber.length > 0 )
      {
         var firstChar = strNumber.charAt(i);
         if ( firstChar == '-' )
         {
            signal = firstChar;
         }
      }
   
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

      if ( strRetNumber.length > 0 )
      {
         strRetNumber = signal + strRetNumber;
      }

      return strRetNumber;
   }
   

function validarF(){ 
   	
   	if (document.Fvalida.name.value.length==0){ 
      	alert("Escribre tu nombre") 
      	document.Fvalida.name.focus() 
      	return 0; 
   	} 
   	if (document.Fvalida.pass.value.length==0){ 
      	alert("Introduce un password") 
      	document.Fvalida.pass.focus() 
      	return 0; 
   	} 
}
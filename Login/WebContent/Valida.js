function validarF(){ 
   	//valido el nombre 
   	if (document.Fvalida.name.value.length==0){ 
      	alert("Tiene que escribir su nombre") 
      	document.Fvalida.name.focus() 
      	return 0; 
   	} 
}
$('#confirmacaoExclusaoModal').on('show.bs.modal', function(event){
	
	var button = $(event.relatedTarget); //Pegar o botão - Botão que disparou o evento.
	
	var codigoCasa = button.data('codigo');
	
	var modal = $(this);
	var form = modal.find('form');
	var action = form.attr('action');
	if (!action.endsWith('/')){
		action += '/';
	}
	
	form.attr('action', action+codigoCasa);
	
	
 
});
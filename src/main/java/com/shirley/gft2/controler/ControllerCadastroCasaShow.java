package com.shirley.gft2.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shirley.gft2.model.CasaShow;
import com.shirley.gft2.repository.CasaCadastros;

@Controller
public class ControllerCadastroCasaShow {

	
	@Autowired
	private CasaCadastros cadastrocasa;

	@RequestMapping("/cadastroscasas")
	public String cadastroscasas() {
		return "CasaShow";
	}

	@RequestMapping(value = "/cadastroscasas", method = RequestMethod.POST)
	public String salvar(CasaShow casa) {
		
		cadastroscasas.save(casa);
		
		return "CasaShow";

	}

}

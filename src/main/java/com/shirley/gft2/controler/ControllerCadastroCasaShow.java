package com.shirley.gft2.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shirley.gft2.model.CasaShow;
import com.shirley.gft2.repository.CasaCadastros;

@Controller
@RequestMapping("/casa")


public class ControllerCadastroCasaShow {
	
	
	@Autowired
	private CasaCadastros cadastrosCasa;


	@RequestMapping("/cadastro")
	public String cadastrar() { 	
		return "Casa/CasaShow";
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String salvar(CasaShow casa) {
		cadastrosCasa.save(casa);
		
		return "Casa/ListaCasas";
	}
	
	
}

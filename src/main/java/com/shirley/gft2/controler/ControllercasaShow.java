package com.shirley.gft2.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shirley.gft2.model.Show;


@Controller
public class ControllercasaShow {
	

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "Login";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "Cadastro";
	}
	
	@RequestMapping("/cadastroshows")
	public String cadastroshows() {
		return "CadastroShows";
	}
	
	@RequestMapping(value="/cadastroshows", method = RequestMethod.POST) 
	public String salvar(Show show) {
		return "CadastroShows";
		
	}
	
}

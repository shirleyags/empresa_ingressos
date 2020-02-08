package com.shirley.gft2.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shirley.gft2.model.CasaShow;
import com.shirley.gft2.repository.CasaCadastros;



@Controller
@RequestMapping("/casa")
public class ControllerCadastroCasaShow {
	
	@Autowired
	private CasaCadastros cadastroscasa;
	
	@RequestMapping("/casacadastro")
	public ModelAndView CasaCadastrar() {
		ModelAndView mv = new ModelAndView("/Casa/CasaShow");
		return mv;
	}
	
	@RequestMapping(value="/casacadastro", method=RequestMethod.POST)
	public ModelAndView salvar(CasaShow casa) {
		ModelAndView mv = new ModelAndView("/Casa/CasaShow");
		cadastroscasa.save(casa);
		return mv;
	}
	
	
	@RequestMapping ("/listacasas")
	public ModelAndView pesquisar() { //Para criar a lista de casas de show.
		List<CasaShow> todasCasas = cadastroscasa.findAll();
		ModelAndView mv = new ModelAndView("/Casa/ListaCasas");
		mv.addObject("casas", todasCasas); // As lista de objetos "todasCasas" estará disponível na view com o nome "casas".
		return mv;}


	
	@RequestMapping ("/{code}")
	public ModelAndView editar(@PathVariable Long code) {
		ModelAndView mv = new ModelAndView("/Casa/CasaShow");
		CasaShow casaRetorna = cadastroscasa.findById(code).get();
		mv.addObject(casaRetorna);
		return mv;	}




}

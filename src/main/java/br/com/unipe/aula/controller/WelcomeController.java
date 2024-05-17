package br.com.unipe.aula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.aula.model.Torcedor;
import br.com.unipe.aula.dao.TorcedorDAO;

@Controller
public class WelcomeController {

	@Autowired
	private TorcedorDAO dao;

	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String welcome() {
		return "formulario";
	}

	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam("dolar") double dolar) {
		ModelAndView modelAndView = new ModelAndView("conversao");
		double Conversao = dolar * (5);
		modelAndView.addObject("dolar", dolar);
		modelAndView.addObject("real", Conversao);
		return modelAndView;
	}

	@PostMapping(value = "/cadastro")
	public ModelAndView cadastrarTorcedor(@ModelAttribute Torcedor torcedor) {

		dao = new TorcedorDAO();
		dao.salvar(torcedor);

		ModelAndView view = new ModelAndView("formulario");
		view.addObject("mensagem", "Torcedor cadastrado com sucesso!");

		return view;
	}
}
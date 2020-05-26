package br.com.oficina.autopassos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.oficina.autopassos.entity.Pessoas;
import br.com.oficina.autopassos.repository.PessoasRepository;

@Controller
@RequestMapping("/")
public class PessoasController {

	private PessoasRepository pessoasRepository;

	@Autowired
	public PessoasController(PessoasRepository pessoaRepository) {
		this.pessoasRepository = pessoaRepository;
	}

	@RequestMapping(value = "/{pessoa}", method = RequestMethod.GET)
	public String listaPessoas(@PathVariable("pessoa") String pessoa, Model model) {
		List<Pessoas> listaPessoas = pessoasRepository.findByNomePessoa(pessoa);
		
		  if (listaPessoas != null) { model.addAttribute("pessoas", listaPessoas); 
		  }
		 
		return "/sidenav";
	}
}

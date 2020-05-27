package br.com.oficina.autopassos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.oficina.autopassos.entity.Pessoas;
import br.com.oficina.autopassos.repository.PessoasRepository;

@Controller
@RequestMapping("/cadastroCliente")
public class PessoasController {
	
	  private PessoasRepository pessoasRepository;
	  
	  @Autowired public PessoasController(PessoasRepository pessoaRepository) {
	  this.pessoasRepository = pessoaRepository; }
	 
	
	@RequestMapping(method = RequestMethod.GET)
	public String formularioCliente() {
		return "cadastroCliente";
	}

	
	  @RequestMapping(method = RequestMethod.POST) 
	  public String adicionaPessoa(Pessoas pessoa) { 
		  pessoa.setTipoPessoa('C');
		  pessoasRepository.save(pessoa);
	  
	 return "redirect:/"; }
	 
	
	
}



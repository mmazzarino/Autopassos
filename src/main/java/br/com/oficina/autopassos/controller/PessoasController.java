package br.com.oficina.autopassos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import br.com.oficina.autopassos.entity.Pessoas;
import br.com.oficina.autopassos.repository.PessoasRepository;

@Controller
@RequestMapping("/cadastro")
public class PessoasController {
	
	  
	  private PessoasRepository pessoasRepository;
	  
	  @Autowired public PessoasController(PessoasRepository pessoaRepository) {
		  this.pessoasRepository = pessoaRepository; 
		  }
	 
	  @GetMapping("/cliente")
	  public ModelAndView formCliente(Pessoas pessoa) {			
		  ModelAndView mv = new ModelAndView("/cadastroCliente");
		  mv.addObject("pessoa", pessoa);			
		  return mv;
		}
		
	  @PostMapping("/cliente") 
	  	public String adicionaCliente(Pessoas pessoa) {
		  pessoa.setTipoPessoa('C'); 
		  pessoasRepository.save(pessoa);  	
		  return "redirect:/";
	  }
	  
	  @GetMapping("/parceiro")
	  public ModelAndView formParceiro(Pessoas pessoa) {			
		  ModelAndView mv = new ModelAndView("/cadastroParceiro");
		  mv.addObject("pessoa", pessoa);			
		  return mv;
		}
		
	  @PostMapping("/parceiro") 
	  	public String adicionaParceiro(Pessoas pessoa) {
		  pessoa.setTipoPessoa('P'); 
		  pessoasRepository.save(pessoa);  	
		  return "redirect:/";
	  }
	
	
	
}



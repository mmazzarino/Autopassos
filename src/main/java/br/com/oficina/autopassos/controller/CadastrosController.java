package br.com.oficina.autopassos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.oficina.autopassos.entity.Pessoas;
import br.com.oficina.autopassos.entity.Servicos;
import br.com.oficina.autopassos.repository.PessoasRepository;
import br.com.oficina.autopassos.repository.ServicosRepository;

@Controller
@RequestMapping("/cadastro")
public class CadastrosController {
	
	  
	  private PessoasRepository pessoasRepository;
	  private ServicosRepository servicosRepository;
	  
	  @Autowired 
	  public CadastrosController(PessoasRepository pessoaRepository, ServicosRepository servicosRepository) {
		  this.pessoasRepository = pessoaRepository; 
		  this.servicosRepository = servicosRepository;
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
	
	  @GetMapping("/servico")
	  public ModelAndView formServico(Servicos servico) {			
		  ModelAndView mv = new ModelAndView("/cadastroServico");
		  mv.addObject("servico", servico);			
		  return mv;
		}
		
	  @PostMapping("/servico") 
	  	public String adicionaServico(Servicos servico) {
		  servicosRepository.save(servico);  	
		  return "redirect:/";
	  }
	
}



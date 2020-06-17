package br.com.oficina.autopassos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.oficina.autopassos.entity.Orcamentos;
import br.com.oficina.autopassos.entity.Pessoas;
import br.com.oficina.autopassos.entity.Servicos;
import br.com.oficina.autopassos.repository.OrcamentosRepository;
import br.com.oficina.autopassos.repository.PessoasRepository;
import br.com.oficina.autopassos.repository.ServicosRepository;

@Controller
@RequestMapping("/orcamento")
public class OrcamentosController {
	
	private OrcamentosRepository orcamentosRepository;
	private ServicosRepository servicosRepository;
	private PessoasRepository pessoasRepository;
	
	@Autowired
	public OrcamentosController(OrcamentosRepository orcamentosRepository, PessoasRepository pessoasRepository, ServicosRepository servicosRepository) {
		this.orcamentosRepository = orcamentosRepository;
		this.servicosRepository = servicosRepository;
	}

	@GetMapping("/novoOrcamento")
	  public ModelAndView formOrcamento(Orcamentos orcamento, Servicos servico) {			
		  ModelAndView mv = new ModelAndView("/realizarOrcamento");
		  mv.addObject("orcamento", orcamento);
		  List<Servicos> listaServicos = servicosRepository.findAll();
		  mv.addObject("listaServicos", listaServicos);
		  
		  return mv;
		}
	
	@GetMapping("/getCliente")
		public ModelAndView listaClientes(Pessoas pessoa) {
			ModelAndView mv = new ModelAndView("/listaPessoas");	
			//mv.addObject("pessoa", pessoa);
			List<Pessoas> pessoas = pessoasRepository.findAll();
			mv.addObject("pessoas", pessoas);
			
			return mv;
	}
	
	/*
	 * @PostMapping("/getCliente") public ModelAndView
	 */
		
	  @PostMapping("/novoOrcamento") 
	  	public String adicionaOrcamento(Orcamentos orcamento) { 
		  orcamentosRepository.save(orcamento);  	
		  return "redirect:/";
	  }
	
}






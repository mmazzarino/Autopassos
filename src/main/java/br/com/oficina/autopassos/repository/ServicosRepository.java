package br.com.oficina.autopassos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oficina.autopassos.entity.Servicos;

public interface ServicosRepository extends JpaRepository<Servicos, Integer>{
	
	public List<Servicos> findAll();

}

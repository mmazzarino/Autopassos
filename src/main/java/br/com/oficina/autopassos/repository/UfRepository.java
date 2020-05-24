package br.com.oficina.autopassos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oficina.autopassos.entity.UF;

public interface UfRepository extends JpaRepository <UF, Integer>{
	
	List<UF> findByNomeUf(String nomeUf);
}

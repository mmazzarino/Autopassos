package br.com.oficina.autopassos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oficina.autopassos.entity.Pessoas;

public interface PessoasRepository extends JpaRepository<Pessoas, Integer>{

	List <Pessoas> findByNomePessoa(String nomePessoa);
}

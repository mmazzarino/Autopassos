package br.com.oficina.autopassos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.oficina.autopassos.entity.Cidades;

public interface CidadesRepository extends JpaRepository<Cidades, Integer>{

	List<Cidades> findByNomeCidade(String nomeCidade);
}

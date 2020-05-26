package br.com.oficina.autopassos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oficina.autopassos.entity.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer>{
	
	Usuarios findByNomeUsuario(String nomeUsuario);

}

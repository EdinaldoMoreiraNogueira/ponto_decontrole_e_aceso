package com.devnaldo.ponto_de_controle_e_acesso.repository;

import com.devnaldo.ponto_de_controle_e_acesso.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {
}

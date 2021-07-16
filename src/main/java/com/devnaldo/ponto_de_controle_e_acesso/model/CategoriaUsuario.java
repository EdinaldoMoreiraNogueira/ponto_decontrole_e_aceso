package com.devnaldo.ponto_de_controle_e_acesso.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CategoriaUsuario {
    @Id
    private Long id;
    private String descrição;
}

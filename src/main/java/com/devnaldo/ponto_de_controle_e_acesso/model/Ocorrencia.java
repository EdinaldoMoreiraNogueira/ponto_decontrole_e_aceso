package com.devnaldo.ponto_de_controle_e_acesso.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Ocorrencia {
    @Id
    private Long id;
    private String nome;
    private String descricao;

}

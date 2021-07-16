package com.devnaldo.ponto_de_controle_e_acesso.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Data
@Entity
public class Localidade {
    @Id
    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descrição;
}

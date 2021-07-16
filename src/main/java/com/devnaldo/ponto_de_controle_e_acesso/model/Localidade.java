package com.devnaldo.ponto_de_controle_e_acesso.model;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;


@Data
@Entity
@Audited
public class Localidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descrição;
}

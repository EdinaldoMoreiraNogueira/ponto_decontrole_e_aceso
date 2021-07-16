package com.devnaldo.ponto_de_controle_e_acesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Empresa {
    @Id
    private Long id;
    private String descrição;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String bairro;
    private String estado;
    private String telefone;

}

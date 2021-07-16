package com.devnaldo.ponto_de_controle_e_acesso.model;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class BancoHoras {

    public class BancoHorasId implements Serializable{
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private  BigDecimal saldoHoras;

}

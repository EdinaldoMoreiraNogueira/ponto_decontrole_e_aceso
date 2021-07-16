package com.devnaldo.ponto_de_controle_e_acesso.controller;

import com.devnaldo.ponto_de_controle_e_acesso.model.BancoHoras;
import com.devnaldo.ponto_de_controle_e_acesso.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.saveBancoHoras(bancoHoras);
    }

    @GetMapping
    public List<BancoHoras> getBancoHorasList() {
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> getBancoHorasByID(@PathVariable("idBancoHoras") Long idBancoHoras) throws Exception{
        return ResponseEntity.ok(bancoHorasService.getById(idBancoHoras).orElseThrow(() -> new Exception("Banco de Horas não encontrado.")));
    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.updateBancoHoras(bancoHoras);
    }

    @DeleteMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> deleteBancoHorasByID(@PathVariable("idBancoHoras") Long idBancoHoras) {
        try {
            bancoHorasService.deleteBancoHoras(idBancoHoras);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();

    }
}

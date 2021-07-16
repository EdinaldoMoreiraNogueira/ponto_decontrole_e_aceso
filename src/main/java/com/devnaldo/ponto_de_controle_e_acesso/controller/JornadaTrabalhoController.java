package com.devnaldo.ponto_de_controle_e_acesso.controller;

import com.devnaldo.ponto_de_controle_e_acesso.model.JornadaTrabalho;
import com.devnaldo.ponto_de_controle_e_acesso.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

        @PostMapping
        public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
            return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
        }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return  jornadaTrabalhoService.findAll();

    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho>  getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        return  ResponseEntity.ok( jornadaTrabalhoService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping("/{idJornada}")
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return  jornadaTrabalhoService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaTrabalhoService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }



}

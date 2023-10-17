package com.curso.api.controllers;


import com.curso.api.domain.models.Remedio;
import com.curso.api.dtos.remedios.DadosCadastroRemedio;
import com.curso.api.services.RemedioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("remedios")
public class RemedioController {

    private RemedioService remedioService;

    public RemedioController(RemedioService remedioService) {
        this.remedioService = remedioService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DadosCadastroRemedio> cadastrar(@RequestBody DadosCadastroRemedio novoRemedio) {
        if (remedioService.cadastraRemedio(novoRemedio).isPresent()) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();
    }

    @GetMapping
    public ResponseEntity<List<Remedio>> listaTodos() {
        return ResponseEntity.ok().body(remedioService.listaTodos());
    }

}

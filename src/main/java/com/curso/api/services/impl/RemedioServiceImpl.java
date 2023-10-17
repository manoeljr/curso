package com.curso.api.services.impl;


import com.curso.api.domain.models.Remedio;
import com.curso.api.domain.repositories.RemedioRepository;
import com.curso.api.dtos.remedios.DadosCadastroRemedio;
import com.curso.api.services.RemedioService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RemedioServiceImpl implements RemedioService {

    private RemedioRepository repository;

    public RemedioServiceImpl(RemedioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Remedio> cadastraRemedio(DadosCadastroRemedio dadosCadastroRemedio) {
        return Optional.empty();
    }

    @Override
    public List<Remedio> listaTodos() {
        return repository.findAll();
    }
}

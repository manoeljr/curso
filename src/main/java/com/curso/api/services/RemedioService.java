package com.curso.api.services;

import com.curso.api.domain.models.Remedio;
import com.curso.api.dtos.remedios.DadosCadastroRemedio;

import java.util.List;
import java.util.Optional;

public interface RemedioService {
    Optional<Remedio> cadastraRemedio(DadosCadastroRemedio dadosCadastroRemedio);
    List<Remedio> listaTodos();
}

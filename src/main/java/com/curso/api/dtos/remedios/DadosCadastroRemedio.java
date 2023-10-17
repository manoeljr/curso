package com.curso.api.dtos.remedios;


import com.curso.api.enums.Laboratorio;
import com.curso.api.enums.Via;


public record DadosCadastroRemedio(
        String nome,
        Via via,
        String quantidade,
        String validade,
        Laboratorio laboratorio
) { }

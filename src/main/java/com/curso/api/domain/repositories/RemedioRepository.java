package com.curso.api.domain.repositories;


import com.curso.api.domain.models.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RemedioRepository extends JpaRepository<Remedio, Long> {
}

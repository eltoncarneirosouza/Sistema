package com.controle.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.sistema.model.Refeicao;

@Repository
public interface RefeicaoRepository extends JpaRepository<Refeicao, Long>{

}

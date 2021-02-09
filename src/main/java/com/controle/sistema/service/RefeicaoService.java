package com.controle.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.controle.sistema.model.Refeicao;
import com.controle.sistema.repository.RefeicaoRepository;

@Service
public class RefeicaoService {
	@Autowired
	private RefeicaoRepository repository;

	public Page<Refeicao> listAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public void save(Refeicao refeicao) {
		repository.save(refeicao);
	}
}

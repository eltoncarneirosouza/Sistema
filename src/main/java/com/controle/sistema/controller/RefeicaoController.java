package com.controle.sistema.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle.sistema.forms.RefeicaoForm;
import com.controle.sistema.model.Refeicao;
import com.controle.sistema.service.RefeicaoService;

@RestController
@RequestMapping("/refeicao")
@CrossOrigin("*")
public class RefeicaoController {

	@Autowired
	private RefeicaoService service;

	private static final Logger log = LoggerFactory.getLogger(RefeicaoController.class);

	@GetMapping
	public Page<Refeicao> list(@PageableDefault(direction = Direction.DESC, page = 0, size = 50)Pageable pageable) {
		return service.listAll(pageable);
	}

	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody RefeicaoForm formulario) {
		Refeicao refeicao = formulario.convert();
		try {
			service.save(refeicao);
			return ResponseEntity.ok().body(refeicao);

		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity<Refeicao>(refeicao, HttpStatus.BAD_REQUEST);
		}
	}
}

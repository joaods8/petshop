package com.joao.petshop.resoucers.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.joao.petshop.service.exceptions.ObjetoNaoEncontradoException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjetoNaoEncontradoException.class)
	public ResponseEntity<StandartError> objectNotFound(ObjetoNaoEncontradoException e, HttpServletRequest request){
		StandartError erro = new StandartError(HttpStatus.NOT_FOUND.value(), e.getMessage());
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

}

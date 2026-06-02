package com.example.atividade_usuarios.service.exception;

public class ParametroUsuarioInvalidoException extends Exception {
	public ParametroUsuarioInvalidoException(String mensagem) {
		super("Parametro inválido:\n" + mensagem);
	}
}

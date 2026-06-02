package com.example.atividade_usuarios.service;

import com.example.atividade_usuarios.service.exception.*;
import com.example.atividade_usuarios.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class UsuarioService {
	private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static final AtomicLong CONTADOR_ATOMICO = new AtomicLong(1);

	public static List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public static void setListaUsuarios(List<Usuario> listaUsuariosInput) {
		listaUsuarios = listaUsuariosInput;
	}

	public static boolean emailExiste(String email) {
		for (Usuario u : listaUsuarios) {
			if (u.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}

	public static void cadastrarUsuario(Usuario usuario) throws ParametroUsuarioInvalidoException {
		if (usuario.getEmail() == null || usuario.getEmail().isEmpty()) {
			throw new ParametroUsuarioInvalidoException("Email vazio");
		}
		if (usuario.getPassword() == null || usuario.getPassword().isEmpty()) {
			throw new ParametroUsuarioInvalidoException("Senha vazia");
		}
		if (emailExiste(usuario.getEmail())){
			throw new ParametroUsuarioInvalidoException("Email já cadastrado");
		}
		if (usuario.getId() == 0) {
			usuario.setId(CONTADOR_ATOMICO.getAndIncrement());
		}
		listaUsuarios.add(usuario);
	}

	public static void listarUsuarios() {
		for (int i = 0; i < listaUsuarios.size(); i++) {
			System.out.printf("Usuário %s ----------\n", i);
			System.out.println("Id: " + listaUsuarios.get(i).getId());
			System.out.println("Email: " + listaUsuarios.get(i).getEmail());
			System.out.println("Senha: " + listaUsuarios.get(i).getPassword());
		}
	}

	// Para mostrar usuários em HTML
	public static String getListaUsuariosHTML() {
		String HTML = new String();

		for (Usuario u : listaUsuarios) {
			HTML += String.format("|\t%s\t|\t%s\t|\t%s\t|<br>", u.getId(), u.getEmail(), u.getPassword());
		}

		return HTML;
	}
}

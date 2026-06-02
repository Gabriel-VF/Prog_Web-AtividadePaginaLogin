package com.example.atividade_usuarios.model;

public class Usuario {
	private long id = 0;
	private String email;
	private String password;

	public Usuario(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public Usuario(long id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

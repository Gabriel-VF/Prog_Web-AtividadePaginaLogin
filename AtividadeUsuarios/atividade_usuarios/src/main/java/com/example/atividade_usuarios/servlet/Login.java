package com.example.atividade_usuarios.servlet;

import java.io.IOException;

import com.example.atividade_usuarios.model.Usuario;
import com.example.atividade_usuarios.service.UsuarioService;
import com.example.atividade_usuarios.service.exception.ParametroUsuarioInvalidoException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	boolean erroJaOcorreu;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String emailInput = req.getParameter("emailInput");
		String passwordInput = req.getParameter("passwordInput");
		Usuario user = new Usuario(emailInput, passwordInput);

		// Simulando erro no input após cadastrar 3 usuários
		if (UsuarioService.getListaUsuarios().size() == 3 && !erroJaOcorreu) {
			user.setEmail(null);
			erroJaOcorreu = true;
		}

		System.out.println("Usuário logou");
		System.out.println("Email: " + emailInput);
		System.out.println("Senha: " + passwordInput);

		req.setAttribute("username", user.getEmail());
		req.setAttribute("password", user.getPassword());

		try {
			UsuarioService.cadastrarUsuario(user);

			System.out.println("\n\nListing users:");
			UsuarioService.listarUsuarios();

			req.setAttribute("listaUsuarios", UsuarioService.getListaUsuariosHTML());
			req.setAttribute("mensagemLogin", "You logged in into the system");

			resp.setStatus(200);
			req.getRequestDispatcher("listar.jsp").forward(req, resp);
		} catch (ParametroUsuarioInvalidoException e) {
			// Parâmetro vazio ou email duplicado
			resp.setStatus(401);
			System.out.println("\nErro ao adicionar usuário:");
			String msgErro = "<h2 class=\"mensagemErro\">" + e.getMessage() + "</h2>";

			req.setAttribute("mensagemErro", msgErro);
			req.setAttribute("mensagemLogin", "Your login failed");

			req.getRequestDispatcher("erro.jsp").forward(req, resp);
			e.printStackTrace();
		}
	}
}

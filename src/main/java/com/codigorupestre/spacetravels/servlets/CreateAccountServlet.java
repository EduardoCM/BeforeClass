package com.codigorupestre.spacetravels.servlets;

import java.io.IOException;

import com.codigorupestre.spacetravels.clases.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("createAccount")
public class CreateAccountServlet extends HttpServlet {

	private static final long serialVersionUID = 5574963266002629125L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Usuario newUser = new Usuario();
		
		newUser.nombre =  req.getParameter("nombre");
		newUser.apellidos = req.getParameter("apellidos");
		newUser.usuario =  req.getParameter("usuario");
		newUser.contrasena = req.getParameter("contrasena");
		newUser.email = req.getParameter("email");
		newUser.telefono = req.getParameter("telefono");
		
		System.out.println(newUser);
		
		
		
		
		
	}
}

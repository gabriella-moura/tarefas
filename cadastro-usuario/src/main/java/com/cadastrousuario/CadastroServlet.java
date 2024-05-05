package com.cadastrousuario;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroServlet extends HttpServlet {

    public ArrayList<String> nomesCadastrados = new ArrayList<>();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");

        nomesCadastrados.add(nome);

        response.setContentType("text/html");
        response.getWriter().println("<h2>Nome cadastrado: " + nome + "</h2>");
        response.getWriter().println("<h2>Sucesso, cadastro enviado!</h2>");
    }
}
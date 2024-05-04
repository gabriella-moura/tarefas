package com.formulariocontato.controller;

import com.formulariocontato.Contato;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class contatoController {
    @GetMapping("/contato")
    public String mostrarFormulario(Contato contato) {
        return "formulario";
    }

    @PostMapping("/contato")
    public String submeterFormulario(Contato contato) {
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("Mensagem: " + contato.getMensagem());

        return "redirect:/resultado";
    }

    @GetMapping("/resultado")
    public String mostrarResultado() {
        return "resultado";
    }
}


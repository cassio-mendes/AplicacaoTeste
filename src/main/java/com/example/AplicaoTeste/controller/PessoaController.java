package com.example.AplicaoTeste.controller;

import com.example.AplicaoTeste.services.PessoaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Classes Controller definem as rotas usadas pela aplicação

@RestController //Indica que esta classe é um Controller
@RequestMapping("/pessoa") //Indica que este Controller vai mapear as rotas da aplicação
public class PessoaController {

    //Injeção de dependência
    private final PessoaService pessoaService;
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
}

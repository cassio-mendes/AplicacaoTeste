package com.example.AplicaoTeste.controller;

import com.example.AplicaoTeste.service.PessoaService;
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

    //TIPOS DE REQUISIÇÕES WEB:
    //GET: Buscar/ler -> @GetMapping
    //POST: Criar/enviar -> @PostMapping
    //PUT: Atualizar tudo -> @PutMapping
    //DELETE: Remover -> @DeleteMapping

}

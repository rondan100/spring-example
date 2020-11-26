package com.example.nome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping
    public ResponseEntity<Pessoa> getPessoa() {

        final Pessoa pessoa = new Pessoa("Ronaldo",29);

        return ResponseEntity.ok(pessoa);
    }

}

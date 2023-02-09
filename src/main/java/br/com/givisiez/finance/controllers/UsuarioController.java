package br.com.givisiez.finance.controllers;

import br.com.givisiez.finance.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/index")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;



    //save

    //delete

    //listAll

    //findById

    //update
}

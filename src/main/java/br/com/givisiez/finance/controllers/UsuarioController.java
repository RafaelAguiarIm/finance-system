package br.com.givisiez.finance.controllers;

import br.com.givisiez.finance.DTO.DadosCadastroUsuario_DTO;
import br.com.givisiez.finance.DTO.DadosUsuarioDetalhadosDTO;
import br.com.givisiez.finance.models.UsuarioModel;
import br.com.givisiez.finance.repositories.UsuarioRepository;
import br.com.givisiez.finance.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/index")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @Autowired //Injeção de dependencias - Instancia o MR e passa as informações
    private UsuarioRepository repository;


    //save
    @Transactional
    @PostMapping
    public ResponseEntity saveMed(@RequestBody @Valid DadosCadastroUsuario_DTO dadosUsuario, UriComponentsBuilder uriBuilder)
    {
        var usuario = new UsuarioModel(dadosUsuario);
        repository.save(usuario);

        //Cod 201 Created
        var uri = uriBuilder.path("/index/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosUsuarioDetalhadosDTO(usuario));

    }

    //delete

    //listAll

    //findById

    //update
}

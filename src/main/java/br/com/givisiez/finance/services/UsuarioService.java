package br.com.givisiez.finance.services;

import br.com.givisiez.finance.models.UsuarioModel;
import br.com.givisiez.finance.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    //save
    public UsuarioModel save(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }



    //delete

    //listAll

    //findById

    //update
}

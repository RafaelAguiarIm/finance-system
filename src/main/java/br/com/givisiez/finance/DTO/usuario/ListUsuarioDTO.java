package br.com.givisiez.finance.DTO.usuario;

import br.com.givisiez.finance.models.UsuarioModel;

public record ListUsuarioDTO(Long id, String nome, String cpf, String telefone, Boolean status) {

    public ListUsuarioDTO(UsuarioModel usuario){
        this(usuario.getId(),usuario.getNome(), usuario.getCpf(), usuario.getTelefone(), usuario.getStatus());
    }
}

package br.com.givisiez.finance.DTO;

import br.com.givisiez.finance.models.UsuarioModel;

import java.time.LocalDate;

public record DadosUsuarioDetalhadosDTO(Long id, String nome, String cpf, String Telefone) {

    public DadosUsuarioDetalhadosDTO(UsuarioModel usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getTelefone());
    }
}

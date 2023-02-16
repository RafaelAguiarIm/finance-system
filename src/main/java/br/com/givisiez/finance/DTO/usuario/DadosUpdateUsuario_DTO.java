package br.com.givisiez.finance.DTO.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosUpdateUsuario_DTO(

        @NotNull
        Long id,
        String nome,
        String cpf,
        String telefone
) {
}

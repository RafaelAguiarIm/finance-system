package br.com.givisiez.finance.DTO;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DadosCadastroUsuario_DTO(
        @NotBlank
        String nome,

        @NotBlank
        String cpf,

        @NotBlank
        String telefone

) {


}

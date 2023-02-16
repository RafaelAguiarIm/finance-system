package br.com.givisiez.finance.models;

import br.com.givisiez.finance.DTO.DadosCadastroUsuario_DTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsuarioModel implements Serializable {

    private static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String cpf;

    //@NotBlank
    //@JsonFormat(pattern = "dd-MM-yyyy")
    //private LocalDate dataNasc;

    @NotBlank
    private String telefone;

    public UsuarioModel(DadosCadastroUsuario_DTO dadosUsuario) {
        this.nome = dadosUsuario.nome();
        this.cpf = dadosUsuario.cpf();
        this.telefone = dadosUsuario.telefone();
    }

    //Implementação separada, - consumo de api de busca de cep
    //private Endereco endereco;




}

package br.com.givisiez.finance.models;

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

    @NotBlank
    private LocalDate dataNasc;

    @NotBlank
    private Long telefone;

    //Implementação separada, - consumo de api de busca de cep
    //private Endereco endereco;




}

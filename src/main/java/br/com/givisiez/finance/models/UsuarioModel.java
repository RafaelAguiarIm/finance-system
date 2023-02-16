package br.com.givisiez.finance.models;

import br.com.givisiez.finance.DTO.usuario.DadosCadastroUsuario_DTO;
import br.com.givisiez.finance.DTO.usuario.DadosUpdateUsuario_DTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.Serializable;


@Entity
@Table(name = "usuarios")
//Anotations Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class UsuarioModel implements Serializable {

    private static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private Boolean status;

    //@NotBlank
    //@JsonFormat(pattern = "dd-MM-yyyy")
    //private LocalDate dataNasc;

    @NotBlank
    private String telefone;

    public UsuarioModel(DadosCadastroUsuario_DTO dadosUsuario) {
        this.nome = dadosUsuario.nome();
        this.cpf = dadosUsuario.cpf();
        this.telefone = dadosUsuario.telefone();

        this.status = true;
    }

    public void disable() {
        this.status = false;
    }

    public void atualizarInformacoes(DadosUpdateUsuario_DTO dadosUsuario) {
           if (dadosUsuario.nome() != null || dadosUsuario.telefone() != null || dadosUsuario.cpf() != null ){
                this.nome = dadosUsuario.nome();
                this.telefone = dadosUsuario.telefone();
                this.cpf = dadosUsuario.cpf();
            }
        }
}

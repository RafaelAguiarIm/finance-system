package br.com.givisiez.finance.models;

import br.com.givisiez.finance.models.enums.TipoConta;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "conta_bancaria")
//Anotations Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContaBancaria implements Serializable {

    private static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private UsuarioModel usuario;

    private String banco;
    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;
    private Double saldo;
    private Boolean status;
}

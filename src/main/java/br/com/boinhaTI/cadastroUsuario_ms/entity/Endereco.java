package br.com.boinhaTI.cadastroUsuario_ms.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "enderecos")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.PRIVATE)
    private UUID id;

    private String rua;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private UUID usuario_id;
}

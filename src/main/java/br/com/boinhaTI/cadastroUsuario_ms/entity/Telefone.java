package br.com.boinhaTI.cadastroUsuario_ms.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "telefones")
@AllArgsConstructor @NoArgsConstructor
@Getter
@Setter
@Builder
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.PRIVATE)
    private UUID id;

    private String numero;

    private String ddd;

    private UUID usuario_id;


}

package example.login.jwt.domain.usuario;

import example.login.jwt.utils.enums.PermissaoEnum;
import example.login.jwt.utils.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50)
    private String sobrenome;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, length = 255)
    private String senha;

    @Column(nullable = false, length = 14)
    private String cpf;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private PermissaoEnum permissao;

    @Column(name = "status_usuario", length = 20)
    @Enumerated(EnumType.STRING)
    private StatusEnum statusUsuario;

    @Column(length = 20)
    private String telefone;

    @Column(name = "data_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dataRegistro;

}

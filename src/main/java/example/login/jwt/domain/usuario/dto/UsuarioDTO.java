package example.login.jwt.domain.usuario.dto;

import example.login.jwt.utils.enums.PermissaoEnum;
import example.login.jwt.utils.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String cpf;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @Enumerated(EnumType.STRING)
    private PermissaoEnum permissao;

}

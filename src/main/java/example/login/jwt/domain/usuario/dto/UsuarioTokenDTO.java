package example.login.jwt.domain.usuario.dto;

import example.login.jwt.utils.enums.PermissaoEnum;
import example.login.jwt.utils.enums.StatusEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsuarioTokenDTO {
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String token;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @Enumerated(EnumType.STRING)
    private PermissaoEnum permissao;
}

package example.login.jwt.domain.usuario.dto;

import lombok.Data;

@Data
public class UsuarioLoginDTO {
    private String email;
    private String senha;
}

package example.login.jwt.domain.usuario.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioCriacaoDTO {

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String cpf;
    private String telefone;

}

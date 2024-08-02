package example.login.jwt.domain.usuario.mapper;

import example.login.jwt.domain.usuario.Usuario;
import example.login.jwt.domain.usuario.dto.UsuarioCriacaoDTO;
import example.login.jwt.domain.usuario.dto.UsuarioDTO;
import example.login.jwt.domain.usuario.dto.UsuarioTokenDTO;

import java.time.LocalDateTime;

public class UsuarioMapper {

    public static Usuario toEntity (UsuarioCriacaoDTO usuarioCriacaoDTO){
        return Usuario.builder()
                .nome(usuarioCriacaoDTO.getNome())
                .sobrenome(usuarioCriacaoDTO.getSobrenome())
                .email(usuarioCriacaoDTO.getEmail())
                .senha(usuarioCriacaoDTO.getSenha())
                .dataRegistro(LocalDateTime.now())
                .telefone(usuarioCriacaoDTO.getTelefone())
                .cpf(usuarioCriacaoDTO.getCpf())
                .build();
    }

    public static UsuarioDTO toDTO (Usuario usuario){
        return UsuarioDTO.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .sobrenome(usuario.getSobrenome())
                .email(usuario.getEmail())
                .telefone(usuario.getTelefone())
                .cpf(usuario.getCpf())
                .status(usuario.getStatusUsuario())
                .permissao(usuario.getPermissao())
                .build();
    }

    public static UsuarioTokenDTO toTokenDTO (Usuario usuario, String token){
        return UsuarioTokenDTO.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .sobrenome(usuario.getSobrenome())
                .email(usuario.getEmail())
                .token(token)
                .status(usuario.getStatusUsuario())
                .permissao(usuario.getPermissao())
                .build();
    }

}

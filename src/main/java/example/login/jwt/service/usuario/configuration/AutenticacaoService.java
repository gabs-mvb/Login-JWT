package example.login.jwt.service.usuario.configuration;


import example.login.jwt.domain.usuario.Usuario;
import example.login.jwt.domain.usuario.dto.UsuarioDetalhesDto;
import example.login.jwt.domain.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> usuarioOPT = usuarioRepository.findByEmail(email);
        if(usuarioOPT.isEmpty()){
                throw new UsernameNotFoundException(String.format("usuario com o email: %s não encontrado", email));
        }
        return new UsuarioDetalhesDto(usuarioOPT.get());
    }

}

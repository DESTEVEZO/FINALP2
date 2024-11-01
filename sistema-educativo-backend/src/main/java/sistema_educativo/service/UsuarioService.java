package sistema_educativo.service;

import sistema_educativo.model.Usuario;
import sistema_educativo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario obtenerUsuarioPorId(String id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void eliminarUsuario(String id) {
        usuarioRepository.deleteById(id);
    }
}

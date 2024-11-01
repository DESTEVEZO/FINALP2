package sistema_educativo.service;

import sistema_educativo.model.Curso;
import sistema_educativo.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public Curso registrarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> obtenerTodosLosCursos() {
        return cursoRepository.findAll();
    }

    public Curso obtenerCursoPorId(String id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public void eliminarCurso(String id) {
        cursoRepository.deleteById(id);
    }
}

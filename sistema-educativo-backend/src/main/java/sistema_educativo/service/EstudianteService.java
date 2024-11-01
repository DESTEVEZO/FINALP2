package sistema_educativo.service;

import sistema_educativo.model.Estudiante;
import sistema_educativo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante registrarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> obtenerTodosLosEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante obtenerEstudiantePorId(String id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    public void eliminarEstudiante(String id) {
        estudianteRepository.deleteById(id);
    }
}

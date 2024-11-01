package sistema_educativo.service;

import sistema_educativo.model.Tramite;
import sistema_educativo.repository.TramiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TramiteService {
    @Autowired
    private TramiteRepository tramiteRepository;

    public Tramite registrarTramite(Tramite tramite) {
        return tramiteRepository.save(tramite);
    }

    public List<Tramite> obtenerTodosLosTramites() {
        return tramiteRepository.findAll();
    }

    public Tramite obtenerTramitePorId(String id) {
        return tramiteRepository.findById(id).orElse(null);
    }

    public void eliminarTramite(String id) {
        tramiteRepository.deleteById(id);
    }
}

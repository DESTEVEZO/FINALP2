package sistema_educativo.controller;

import sistema_educativo.model.Tramite;
import sistema_educativo.service.TramiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tramites")
public class TramiteController {
    @Autowired
    private TramiteService tramiteService;

    @PostMapping("/registrar")
    public ResponseEntity<Tramite> registrarTramite(@RequestBody Tramite tramite) {
        Tramite nuevoTramite = tramiteService.registrarTramite(tramite);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoTramite);
    }

    @GetMapping
    public ResponseEntity<List<Tramite>> obtenerTramites() {
        return ResponseEntity.ok(tramiteService.obtenerTodosLosTramites());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tramite> obtenerTramitePorId(@PathVariable String id) {
        Tramite tramite = tramiteService.obtenerTramitePorId(id);
        return tramite != null ? ResponseEntity.ok(tramite) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTramite(@PathVariable String id) {
        tramiteService.eliminarTramite(id);
        return ResponseEntity.noContent().build();
    }
}

package sistema_educativo.controller;

import sistema_educativo.model.Curso;
import sistema_educativo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping("/registrar")
    public ResponseEntity<Curso> registrarCurso(@RequestBody Curso curso) {
        Curso nuevoCurso = cursoService.registrarCurso(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCurso);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> obtenerCursos() {
        return ResponseEntity.ok(cursoService.obtenerTodosLosCursos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> obtenerCursoPorId(@PathVariable String id) {
        Curso curso = cursoService.obtenerCursoPorId(id);
        return curso != null ? ResponseEntity.ok(curso) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCurso(@PathVariable String id) {
        cursoService.eliminarCurso(id);
        return ResponseEntity.noContent().build();
    }
}

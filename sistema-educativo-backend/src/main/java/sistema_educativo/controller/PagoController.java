package sistema_educativo.controller;

import sistema_educativo.model.Pago;
import sistema_educativo.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {
    @Autowired
    private PagoService pagoService;

    @PostMapping("/registrar")
    public ResponseEntity<Pago> registrarPago(@RequestBody Pago pago) {
        Pago nuevoPago = pagoService.registrarPago(pago);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPago);
    }

    @GetMapping
    public ResponseEntity<List<Pago>> obtenerPagos() {
        return ResponseEntity.ok(pagoService.obtenerTodosLosPagos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pago> obtenerPagoPorId(@PathVariable String id) {
        Pago pago = pagoService.obtenerPagoPorId(id);
        return pago != null ? ResponseEntity.ok(pago) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPago(@PathVariable String id) {
        pagoService.eliminarPago(id);
        return ResponseEntity.noContent().build();
    }
}

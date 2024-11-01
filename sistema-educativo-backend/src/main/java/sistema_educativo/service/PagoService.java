package sistema_educativo.service;

import sistema_educativo.model.Pago;
import sistema_educativo.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    public Pago registrarPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    public List<Pago> obtenerTodosLosPagos() {
        return pagoRepository.findAll();
    }

    public Pago obtenerPagoPorId(String id) {
        return pagoRepository.findById(id).orElse(null);
    }

    public void eliminarPago(String id) {
        pagoRepository.deleteById(id);
    }
}

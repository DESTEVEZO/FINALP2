package sistema_educativo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "pagos")
public class Pago {
    @Id
    private String id;
    private String estudianteId; // ID del estudiante
    private double monto;
    private Date fecha;
    private String metodoPago; // Ejemplo: "tarjeta", "transferencia"

    // Constructor
    public Pago(String estudianteId, double monto, Date fecha, String metodoPago) {
        this.estudianteId = estudianteId;
        this.monto = monto;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(String estudianteId) {
        this.estudianteId = estudianteId;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}

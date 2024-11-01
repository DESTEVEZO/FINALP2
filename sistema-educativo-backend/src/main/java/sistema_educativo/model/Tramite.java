package sistema_educativo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tramites")
public class Tramite {
    @Id
    private String id;
    private String estudianteId; // ID del estudiante
    private String tipo; // Ejemplo: "certificado", "título", etc.
    private String estado; // Ejemplo: "pendiente", "completado"
    private String observaciones;

    // Constructor
    public Tramite(String estudianteId, String tipo, String estado, String observaciones) {
        this.estudianteId = estudianteId;
        this.tipo = tipo;
        this.estado = estado;
        this.observaciones = observaciones;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}

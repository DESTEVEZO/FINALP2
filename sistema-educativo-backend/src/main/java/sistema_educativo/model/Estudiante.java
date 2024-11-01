package sistema_educativo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "estudiantes")
public class Estudiante {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String carrera; // ID o nombre de la carrera
    private List<String> cursos; // Referencias a IDs de cursos
    private List<String> pagos; // Referencias a IDs de pagos

    // Constructor
    public Estudiante(String nombre, String apellido, String carrera, List<String> cursos, List<String> pagos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.cursos = cursos;
        this.pagos = pagos;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    public List<String> getPagos() {
        return pagos;
    }

    public void setPagos(List<String> pagos) {
        this.pagos = pagos;
    }
}

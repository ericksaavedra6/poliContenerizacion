package co.com.esaavedra.entregacontenerizacion.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Table(name = "persona")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int idPersona;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "numero_identificacion")
    private int numeroIdentificacion;
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;
    @Column(name = "activo")
    private boolean activo;

    @OneToMany(mappedBy = "personaI")
    @com.fasterxml.jackson.annotation.JsonManagedReference
    List<Contacto> contactos;
}

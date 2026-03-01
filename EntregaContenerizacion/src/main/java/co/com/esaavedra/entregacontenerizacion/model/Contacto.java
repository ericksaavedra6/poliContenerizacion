package co.com.esaavedra.entregacontenerizacion.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "contacto")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private int idContacto;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private Long telefono;
    @Column(name = "celular")
    private Long celular;
    @Column(name = "casa")
    private boolean casa;
    @Column(name = "oficina")
    private boolean oficina;
    @Column(name = "otro")
    private boolean otro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_persona", nullable = false)
    @com.fasterxml.jackson.annotation.JsonBackReference
    Persona personaI;

}

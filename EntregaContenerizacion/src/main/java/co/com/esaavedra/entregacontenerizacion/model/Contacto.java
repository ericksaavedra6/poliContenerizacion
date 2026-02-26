package co.com.esaavedra.entregacontenerizacion.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "Contacto")
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
    private int telefono;
    @Column(name = "celular")
    private int celular;
    @Column(name = "casa")
    private boolean casa;
    @Column(name = "oficina")
    private boolean oficina;
    @Column(name = "otro")
    private boolean otro;

    @ManyToOne
    @JoinColumn(name="id_persona")
    Persona persona;

}

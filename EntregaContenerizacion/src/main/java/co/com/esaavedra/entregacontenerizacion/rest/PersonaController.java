package co.com.esaavedra.entregacontenerizacion.rest;


import co.com.esaavedra.entregacontenerizacion.model.Persona;
import co.com.esaavedra.entregacontenerizacion.service.PersonaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Personas")
@RequestMapping("poli/contenerizacion/v1")
public class PersonaController {

    @Autowired
    PersonaService service;

    @Operation(summary = "Consulta de personas en base de datos", description = "Este metodo permite consultar personas en la base de datos")
    @GetMapping("/personas")
    public ResponseEntity<?> consultarPersonas()
    {
        return ResponseEntity.ok(service.consultarPersonas());
    }

    @Operation(summary = "Creacion de persona en base de datos", description = "Este metodo permite crear personas en la base de datos")
    @PostMapping("/personas")
    public ResponseEntity<?> crearPersona(@RequestBody Persona persona)
    {
        return ResponseEntity.ok(service.crearPersona(persona));
    }
    @Operation(summary = "Consultar persona especifica", description = "Este metodo permite consultar una persona especifica")
    @GetMapping("/personas/{id}")
    public ResponseEntity<?> consultarPersona(@PathVariable("id") int idPersona)
    {
        return ResponseEntity.ok(service.consultarPersona(idPersona));
    }
    @Operation(summary = "Actualizar persona en base de datos", description = "Este metodo permite actualizar personas en la base de datos")
    @PutMapping("/personas/{id}")
    public ResponseEntity<?> actualizarPersona(@PathVariable("id") int idPersona,@RequestBody Persona persona)
    {
        return ResponseEntity.ok(service.actualizarPersona(persona,idPersona));
    }
    @Operation(summary = "Eliminar persona en base de datos", description = "Este metodo permite eliminar personas en la base de datos")
    @DeleteMapping("/personas/{id}")
    public ResponseEntity<?> eliminarPersona(@PathVariable("id") int idPersona)
    {
        return ResponseEntity.ok(service.deletePersona(idPersona));
    }


}

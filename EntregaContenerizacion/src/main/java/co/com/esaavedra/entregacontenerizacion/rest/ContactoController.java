package co.com.esaavedra.entregacontenerizacion.rest;


import co.com.esaavedra.entregacontenerizacion.model.Contacto;
import co.com.esaavedra.entregacontenerizacion.repository.ContactoRepository;
import co.com.esaavedra.entregacontenerizacion.service.ContactoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Contactos")
@RestController
@RequestMapping("poli/contenerizacion/v1")
public class ContactoController {


    @Autowired
    ContactoService contactoService;


    @GetMapping("/contactos")
    public ResponseEntity<?> consultarContactos()
    {
        return ResponseEntity.ok(contactoService.consultarContactos());
    }

    @PostMapping("/contactos")
    public ResponseEntity<?> crearContacto(@RequestBody Contacto contacto)
    {
        return ResponseEntity.ok(contactoService.crearContacto(contacto));
    }

    @GetMapping("/contactos/{id}")
    public ResponseEntity<?> consultarContacto(@PathVariable("id") int idContacto)
    {
        return ResponseEntity.ok(contactoService.consultarContacto(idContacto));
    }

    @PutMapping("/contactos/{id}")
    public ResponseEntity<?> actualizarContacto(@PathVariable("id") int idContacto, @RequestBody Contacto contacto)
    {
        return ResponseEntity.ok(contactoService.actualizarContacto(contacto,idContacto));
    }

    @DeleteMapping("/contactos/{id}")
    public ResponseEntity<?> eliminarContacto(@PathVariable("id") int idContacto)
    {
        return ResponseEntity.ok(contactoService.eliminarContacto(idContacto));
    }

}

package co.com.esaavedra.entregacontenerizacion.service;


import co.com.esaavedra.entregacontenerizacion.model.Contacto;
import co.com.esaavedra.entregacontenerizacion.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ContactoService {

    @Autowired
    ContactoRepository contactoRepository;

    public Contacto crearContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    public List<Contacto> consultarContactos() {
        return contactoRepository.findAll();
    }

    public Optional<Contacto> consultarContacto(int idContacto) {
        return contactoRepository.findById(idContacto);
    }

    public Contacto actualizarContacto(Contacto contactoActualizar, int idContacto) {
        Optional<Contacto> contactoA = contactoRepository.findById(idContacto);
        if (contactoA.isPresent()) {
            Contacto contactoConsultado = contactoA.get();
            contactoActualizar.setIdContacto(contactoConsultado.getIdContacto());
            return contactoRepository.save(contactoActualizar);

        } else {
            return null;
        }
    }

    public boolean eliminarContacto(int idContacto)
    {
        Optional<Contacto> contactoA = contactoRepository.findById(idContacto);
        if (contactoA.isPresent()) {
             contactoRepository.delete(contactoA.get());
            return true;
        } else {
            return false;
        }
    }

}

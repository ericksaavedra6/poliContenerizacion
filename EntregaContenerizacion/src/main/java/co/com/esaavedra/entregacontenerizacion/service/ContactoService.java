package co.com.esaavedra.entregacontenerizacion.service;


import co.com.esaavedra.entregacontenerizacion.model.Contacto;
import co.com.esaavedra.entregacontenerizacion.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactoService {

    @Autowired
    ContactoRepository contactoRepository;

    public Contacto crearContacto(Contacto contacto)
    {
        return contactoRepository.save(contacto);
    }

}

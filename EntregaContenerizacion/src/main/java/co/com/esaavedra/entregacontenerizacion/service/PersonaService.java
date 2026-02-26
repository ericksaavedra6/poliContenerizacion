package co.com.esaavedra.entregacontenerizacion.service;


import co.com.esaavedra.entregacontenerizacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;
}

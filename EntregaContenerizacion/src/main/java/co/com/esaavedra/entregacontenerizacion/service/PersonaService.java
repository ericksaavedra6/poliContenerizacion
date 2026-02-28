package co.com.esaavedra.entregacontenerizacion.service;


import co.com.esaavedra.entregacontenerizacion.model.Persona;
import co.com.esaavedra.entregacontenerizacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> consultarPersonas() {
        return personaRepository.findAll();
    }

    public Optional<Persona> consultarPersona(int idPersona) {
        return personaRepository.findById(idPersona);

    }

    public Persona actualizarPersona(Persona personaActualizar, int idPersona) {
        Optional<Persona> personaC = personaRepository.findById(idPersona);
        if (personaC.isPresent()) {
            personaActualizar.setIdPersona(personaC.get().getIdPersona());
            return personaRepository.save(personaActualizar);
        } else {
            return null;
        }
    }

    public boolean deletePersona(int idPersona) {
        Optional<Persona> personaC = personaRepository.findById(idPersona);
        if (personaC.isPresent()) {
            personaRepository.delete(personaC.get());
            return true;
        } else {
            return false;
        }
    }
}

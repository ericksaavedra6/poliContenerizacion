package co.com.esaavedra.entregacontenerizacion.repository;


import co.com.esaavedra.entregacontenerizacion.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {


}

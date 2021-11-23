package es.curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.curso.modelo.entidad.Persona;

@Repository
public interface DaoPersona extends JpaRepository<Persona, Integer>{

}

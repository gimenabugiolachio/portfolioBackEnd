package com.proyectoAP.gimenabugiolachio.repository;

import com.proyectoAP.gimenabugiolachio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}

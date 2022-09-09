
package com.proyectoAP.gimenabugiolachio.repository;

import com.proyectoAP.gimenabugiolachio.entity.AcercaDe;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAcercaDe extends JpaRepository<AcercaDe, Integer>{
    public Optional<AcercaDe> findByNombreA(String nombreA);
    public boolean existsByNombreA(String nombreA);
}


package com.proyectoAP.gimenabugiolachio.repository;

import com.proyectoAP.gimenabugiolachio.entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer> {
  public Optional<Skills> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}

package com.proyectoAP.gimenabugiolachio.security.Repository;

import com.proyectoAP.gimenabugiolachio.security.Entity.Rol;
import com.proyectoAP.gimenabugiolachio.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
   Optional<Rol> findByRolNombre(RolNombre rolNombre); 
}

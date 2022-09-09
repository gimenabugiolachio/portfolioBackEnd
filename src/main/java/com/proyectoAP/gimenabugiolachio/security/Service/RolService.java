package com.proyectoAP.gimenabugiolachio.security.Service;

import com.proyectoAP.gimenabugiolachio.security.Entity.Rol;
import com.proyectoAP.gimenabugiolachio.security.Enums.RolNombre;
import com.proyectoAP.gimenabugiolachio.security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
   @Autowired 
   IRolRepository irolRepository;
   
   public Optional<Rol> getByRolNombre(RolNombre rolNombre){
       return irolRepository.findByRolNombre(rolNombre);
   }
   
   public void save(Rol rol){
       irolRepository.save(rol);
   }
   
}

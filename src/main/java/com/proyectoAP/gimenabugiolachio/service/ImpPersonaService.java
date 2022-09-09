package com.proyectoAP.gimenabugiolachio.service;

import com.proyectoAP.gimenabugiolachio.entity.Persona;
import com.proyectoAP.gimenabugiolachio.interfac.IPersonaService;
import com.proyectoAP.gimenabugiolachio.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;
    

    @Override
    public List<Persona> getPersona() {
       List<Persona> pers = ipersonaRepository.findAll();
       return pers;
    }

    @Override
    public void savePersona(Persona pers) {
        ipersonaRepository.save(pers);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona pers = ipersonaRepository.findById(id).orElse(null);
        return pers;
    }
    
}

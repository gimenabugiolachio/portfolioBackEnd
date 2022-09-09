package com.proyectoAP.gimenabugiolachio.interfac;

import com.proyectoAP.gimenabugiolachio.entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //traer lista persona
    public List<Persona> getPersona();   
    
    //guardar persona 
    public void savePersona(Persona pers);
    
    //eliminar usuario    
    public void deletePersona(Long id);
    
    //buscar persona   
    public Persona findPersona(Long id);
}
